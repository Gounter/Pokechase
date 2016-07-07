package com.poke.models;

/**
 * Created by deasel on 2016-07-06.
 */
public class PokemonLocation {
    private double latitude;
    private double longitude;
    private Pokemon pokemon;

    public PokemonLocation(){
    }

    public PokemonLocation(double latitude, double longitude, Pokemon pokemon){
        this.latitude = latitude;
        this.longitude = longitude;
        this.pokemon = pokemon;
    }

    public PokemonLocation (double latitude, double longitude, String pokemon){
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
