package com.example.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String Index(){
        return "index";
    }

    @GetMapping("/home")
    public String Home(){
        return "index";
    }

    @GetMapping("/index")
    public String Main(){
        return "index";
    }


}
