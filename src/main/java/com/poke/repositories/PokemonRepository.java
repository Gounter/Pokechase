package com.poke.repositories;

import com.poke.models.Pokedex;
import com.poke.models.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by deasel on 2016-07-06.
 */

@Component
public class PokemonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_STMT =
            "insert into pokemon (number,name)"
            + "values(?,?)"
            + " on conflict do nothing"
            ;

    private static final String SELECTALL_STMT =
            "SELECT number, name FROM pokemon"
            ;

    private static final String SELECT_STMT =
            "SELECT number, name FROM pokemon"
            + "WHERE number = ?"
            ;

    public void truncate(){
        jdbcTemplate.execute("ALTER SEQUENCE pokemon_id_seq RESTART WITH 1;");
        jdbcTemplate.execute("TRUNCATE TABLE BIXI;");
    }

    public Pokedex fillPokedex(){
        Pokedex pokedex= new Pokedex();
        List<Map<String,Object>> pokemons = jdbcTemplate.queryForList(SELECTALL_STMT);
        for (Map pokemon:pokemons) {
            Pokemon newPokemon = new Pokemon();
            newPokemon.setName((String)(pokemon.get("name")));
            newPokemon.setNumber((int)(pokemon.get("number")));
            pokedex.addNewPokemon(newPokemon);
        }
    }
}

