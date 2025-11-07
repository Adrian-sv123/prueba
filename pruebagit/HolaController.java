package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String home() {
        return "¡Hola desde Spring Boot! 🚀";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Este es otro endpoint: /saludo 👋";
    }
}
