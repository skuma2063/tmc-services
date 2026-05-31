package com.ksgroup.tmc_services.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to TMC Services Microservice";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}