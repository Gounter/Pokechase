package com.poke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by deasel on 2016-07-06.
 */

@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String index(Model model){return "index";}
    @RequestMapping("/home")
    public String home(Model model){return "views/home";}
    @RequestMapping("map")
    public String map(Model model){return "views/map";}
}
