package com.example.keycloakspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("demo")
    public String controlador() {
        return "Hola Mundo";
    }
}