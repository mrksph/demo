package com.mrksph.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @GetMapping(value = "/greeting")
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping(value = "/greeting/{username}")
    public String greeting(@PathVariable String username) {
        return String.format("Hello %s!", username);
    }
}
