package com.tech.microservices.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        return "Hello World";
    }

}
