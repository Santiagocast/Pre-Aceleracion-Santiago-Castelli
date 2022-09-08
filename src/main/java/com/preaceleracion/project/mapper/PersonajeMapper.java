package com.preaceleracion.project.mapper;


import com.preaceleracion.project.DTO.PersonajeDTO;
import com.preaceleracion.project.entity.Personaje;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeMapper{
    public Personaje personajeDTOToEntity(PersonajeDTO dto){
        Personaje personaje = new Personaje();
        personaje.setNombrePersonaje(dto.getNombrePersonaje());
        personaje.setImagen(dto.getImagen());
        personaje.setEdad(dto.getEdad());
        personaje.setPeso(dto.getPeso());
        personaje.setPeliculaAsociada(dto.getPeliculaAsociada());
        return  personaje;
    }

    public  PersonajeDTO entityToPersonaje(Personaje personaje){
        PersonajeDTO dto = new PersonajeDTO();
        dto.setIdPersonaje(personaje.getIdPersonaje());
        dto.setEdad(personaje.getEdad());
        dto.setHistoria(personaje.getHistoria());
        dto.setNombrePersonaje(personaje.getNombrePersonaje());
        dto.setPeso(personaje.getPeso());
        dto.setImagen(personaje.getImagen());
        dto.setPeliculaAsociada(personaje.getPeliculaAsociada());
        return dto;
    }
    public List<PersonajeDTO> personajeListToList(List<Personaje> entities) {
        List<PersonajeDTO> dtos = new ArrayList<>();
        for (Personaje personaje : entities) {
            dtos.add(this.entityToPersonaje(personaje));
        }
        return dtos;
    }

}
