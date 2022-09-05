package com.preaceleracion.project.mapper;

import com.preaceleracion.project.DTO.GeneroDTO;
import com.preaceleracion.project.entity.Genero;
import org.springframework.stereotype.Component;

@Component
public class ContinenteMapper {
    public Genero generoDTOToEntity(GeneroDTO dto){
        Genero genero = new Genero();
        genero.setImagen(dto.getImagen());
        genero.setNombreGenero(dto.getNombreGenero());
        genero.setPeliculasAsociadas(dto.getPeliculasAsociadas());
        return genero;
    }
}
