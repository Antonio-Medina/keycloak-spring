package com.example.keycloakspring.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("hello-1")
    @PreAuthorize("hasRole('admin_client')")
    public String helloAdmin() {
        return "Hello ADMIN";
    }

    @GetMapping("hello-2")
    @PreAuthorize("hasRole('user_client') or hasRole('admin_client')")
    public String helloUser() {
        return "Hello USER";
    }
}