package com.study.controller;


import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvController {

    private final Environment environment;

    public EnvController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/env")
    public Environment getEnv() {

        return environment;
    }
}
