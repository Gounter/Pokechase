package com.poke.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deasel on 2016-07-06.
 */
public class Pokedex {
    List<Pokemon> pokedex;
    Pokedex(){
        pokedex = new ArrayList<>(151);
    }

    public void addNewPokemon(Pokemon pokemon){
        pokedex.set(pokemon.getNumber()-1, pokemon);
    }

}
