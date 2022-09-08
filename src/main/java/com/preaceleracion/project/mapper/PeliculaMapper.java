package com.preaceleracion.project.mapper;


import com.preaceleracion.project.DTO.PeliculaDTO;
import com.preaceleracion.project.entity.Pelicula;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PeliculaMapper {

    public Pelicula peliculaDTOToEntity(PeliculaDTO dto){
        Pelicula pelicula = new Pelicula();
        pelicula.setTituloPelicula(dto.getTituloPelicula());
        pelicula.setImagen(dto.getImagen());
        pelicula.setFechaCreacion(dto.getFechaCreacion());
        pelicula.setCalificacion(dto.getCalificacion());
        pelicula.setGenero(dto.getGenero());
        pelicula.setPersonajesAsociados(dto.getPersonajesAsociados());
        return  pelicula;
    }

    public PeliculaDTO entityToPeliculaDTO(Pelicula pelicula){
        PeliculaDTO dto = new PeliculaDTO();
        dto.setIdPelicula(pelicula.getIdPelicula());
        dto.setTituloPelicula(pelicula.getTituloPelicula());
        dto.setFechaCreacion(pelicula.getFechaCreacion());
        dto.setCalificacion(pelicula.getCalificacion());
        dto.setGenero(pelicula.getGenero());
        dto.setImagen(pelicula.getImagen());
        dto.setPersonajesAsociados(pelicula.getPersonajesAsociados());
        return dto;
    }
    public List<PeliculaDTO> peliculaListToList(List<Pelicula> entities) {
        List<PeliculaDTO> dtos = new ArrayList<>();
        for (Pelicula pelicula : entities) {
            dtos.add(this.entityToPeliculaDTO(pelicula));
        }
        return dtos;
    }

}
