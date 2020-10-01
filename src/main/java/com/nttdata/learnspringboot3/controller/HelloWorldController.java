package com.nttdata.learnspringboot3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {

    @RequestMapping("/")
    public String returnHelloWorld(){
        return "<h1>Hello World, what the fuuuck am I doing<h1>";
    }
}
