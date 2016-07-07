package com.poke.models;

/**
 * Created by deasel on 2016-07-06.
 */
public class Pokemon {
    private String name;
    private int number;

    public Pokemon(){

    }

    public Pokemon(int number, String name){
        this.number=number;
        this.name=name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " #" + number;
    }
}
