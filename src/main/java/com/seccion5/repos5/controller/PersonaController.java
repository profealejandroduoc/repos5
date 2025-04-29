package com.seccion5.repos5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion5.repos5.model.Persona;
import com.seccion5.repos5.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public String saludar() {
        return "Hola el microservicio funciona!!!";
    }

    @PostMapping
    public Persona agregar(@RequestBody Persona persona)
    {
        return personaService.guardarPersona(persona);
    }

    
    
    
}
