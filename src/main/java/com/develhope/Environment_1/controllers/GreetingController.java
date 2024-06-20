package com.develhope.Environment_1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${devName}")
    private String devName;

    @Value("${authCode}")
    private String authCode;

    @GetMapping("/")
    public String greet() {
        return "Hello, Developer " + devName + "! Your auth code is: " + authCode;
    }
}

