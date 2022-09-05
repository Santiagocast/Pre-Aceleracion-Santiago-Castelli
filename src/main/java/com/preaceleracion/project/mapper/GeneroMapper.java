package com.preaceleracion.project.mapper;

import com.preaceleracion.project.DTO.GeneroDTO;
import com.preaceleracion.project.entity.Genero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeneroMapper {
    public Genero generoDTOToEntity(GeneroDTO dto){
        Genero genero = new Genero();
        genero.setImagen(dto.getImagen());
        genero.setNombreGenero(dto.getNombreGenero());
        genero.setPeliculasAsociadas(dto.getPeliculasAsociadas());
        return genero;
    }

    public GeneroDTO entityToGenero(Genero genero){
        GeneroDTO dto = new GeneroDTO();
        dto.setIdGenero(genero.getIdGenero());
        dto.setImagen(genero.getImagen());
        dto.setPeliculasAsociadas(genero.getPeliculasAsociadas());
        dto.setNombreGenero(genero.getNombreGenero());
        return dto;
    }

    public List<GeneroDTO> generoListToList(List<Genero> entities){
        List<GeneroDTO> dtos = new ArrayList<>();
        for (Genero genero: entities) {
            dtos.add(this.entityToGenero(genero));
        }
        return dtos;
    }
}
