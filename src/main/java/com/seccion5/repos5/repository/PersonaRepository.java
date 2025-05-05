package com.seccion5.repos5.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion5.repos5.model.Persona;

@Repository
public class PersonaRepository {
    private List<Persona> personas=new ArrayList<>();

    /*
     * 
     * SOLO PRUEBAS
     */
    public PersonaRepository(){
        personas.add(new Persona(1, "12.345.678-9", "Juan", "Pérez", 30));
        personas.add(new Persona(2, "23.456.789-0", "María", "González", 25));
        personas.add(new Persona(3, "34.567.890-1", "Carlos", "Ramírez", 40));
        personas.add(new Persona(4, "45.678.901-2", "Ana", "Torres", 35));
        personas.add(new Persona(5, "56.789.012-3", "Luis", "Martínez", 28));
    }



    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }


    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas) {
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;
    }

    public Persona update(int id, Persona pmodificada){
        Persona per=read(id);
        if(per!=null){
            //per.setId(); omitir 
            //per.setRut(); omitir por inconsistencia de datos
            per.setNombre(pmodificada.getNombre());
            per.setApellido(pmodificada.getApellido());
            per.setEdad(pmodificada.getEdad());
            return per;
        }
        return null;
    }

    public String delete(int id){
        Persona kill=read(id);
        if(kill!=null){
            personas.remove(kill);
            return "Persona Eliminada!!!";
        }
        return "Persona no encontrada";
    }
}
