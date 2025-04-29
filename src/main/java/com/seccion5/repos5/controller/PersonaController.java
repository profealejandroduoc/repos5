package com.seccion5.repos5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    
    @GetMapping
    public String saludar() {
        return "Hola el microservicio funciona!!!";
    }
    
}
