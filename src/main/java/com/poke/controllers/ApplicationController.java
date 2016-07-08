package com.poke.controllers;

import com.poke.models.PokemonLocation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by deasel on 2016-07-06.
 */

@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String index(Model model){return "index";}
    @RequestMapping("/home")
    public String home(Model model){return "views/home";}
    @RequestMapping("/pokedex")
    public String pokedex(Model model){return "views/pokedex";}
    @RequestMapping("/map")
    public String map(Model model){return "views/map";}

    @RequestMapping(value = "/location", method = RequestMethod.POST)
    public PokemonLocation form(PokemonLocation pokemonLocation, Model model){
        PokemonLocation result=null;

        return result;
    }

}
