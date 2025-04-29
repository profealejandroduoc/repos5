package com.seccion5.repos5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion5.repos5.model.Persona;
import com.seccion5.repos5.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona)
    {
        return personaRepository.create(persona);
    }
}
