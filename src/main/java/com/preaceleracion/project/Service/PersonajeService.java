package com.preaceleracion.project.Service;

import com.preaceleracion.project.DTO.PersonajeDTO;

import java.util.List;

public interface PersonajeService {
    PersonajeDTO save(PersonajeDTO personaje);
    List<PersonajeDTO> getAllPersonaje();
}
