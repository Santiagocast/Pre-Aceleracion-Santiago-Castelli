package com.preaceleracion.project.Service.implementacion;

import com.preaceleracion.project.DTO.PersonajeDTO;
import com.preaceleracion.project.Repository.PersonajeRepository;
import com.preaceleracion.project.Service.PersonajeService;
import com.preaceleracion.project.entity.Personaje;
import com.preaceleracion.project.mapper.PersonajeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeMapper personajeMapper;
    @Autowired
    private PersonajeRepository personajeRepository;
    public PersonajeDTO save(PersonajeDTO dto){
        Personaje personaje  = personajeMapper.personajeDTOToEntity(dto);
        Personaje personajeGuardado = personajeRepository.save(personaje);
        PersonajeDTO result = personajeMapper.entityToPersonaje(personajeGuardado);
        return result;
    }

    public List<PersonajeDTO> getAllPersonaje() {
        List<Personaje> entities = this.personajeRepository.findAll();
        List<PersonajeDTO> result = personajeMapper.personajeListToList(entities);
        return result;
    }
}
