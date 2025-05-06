package com.seccion5.repos5.service;

import java.util.List;

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

    public List<Persona> listarTodas()
    {
        return personaRepository.readAll();
    }

    public Persona buscarxId(int id){
        return personaRepository.read(id);
    }


    public Persona buscarxrut(String rut){
        return personaRepository.readByRut(rut);
    }

    public Persona modificarPersona(int id, Persona pmodificada){
        return personaRepository.update(id, pmodificada);
    }

    public String eliminarPersona(int id){
        return personaRepository.delete(id);
    }
}
