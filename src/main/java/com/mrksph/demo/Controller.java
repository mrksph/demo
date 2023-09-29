package com.mrksph.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @GetMapping(value = "/greeting")
    public String greeting() {
        return "Hello World!";
    }
}
