package com.seccion5.repos5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion5.repos5.model.Persona;
import com.seccion5.repos5.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @GetMapping
    public List<Persona> getPersonas() {
        return personaService.listarTodas();
    }

    @PostMapping
    public Persona postPersona(@RequestBody Persona persona)
    {
        return personaService.guardarPersona(persona);
    }

    @GetMapping("/{id}") //localhost:8080/api/personas/3
    public Persona getPersona(@PathVariable int id) {
        return personaService.buscarxId(id);
    }
    
    @PutMapping("/{id}")
    public Persona putPersona(@PathVariable int id, @RequestBody Persona pmodificada){
       return personaService.modificarPersona(id, pmodificada);
    }

    @DeleteMapping("/{id}")
    public String deletePersona(@PathVariable int id){
        return personaService.eliminarPersona(id);
    }
    
    
}
