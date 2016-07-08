package com.poke.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by deasel on 2016-07-06.
 */
public class Pokemon {
    private String name;
    private int number;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public Pokemon(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
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
