package com.poke.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by deasel on 2016-07-06.
 */

@Component
public class PokemonLocation {
    private double latitude;
    private double longitude;
    private Pokemon pokemon;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PokemonLocation(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired
    public PokemonLocation(double latitude, double longitude, Pokemon pokemon,JdbcTemplate jdbcTemplate){
        this.latitude = latitude;
        this.longitude = longitude;
        this.pokemon = pokemon;
        this.jdbcTemplate = jdbcTemplate;
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
