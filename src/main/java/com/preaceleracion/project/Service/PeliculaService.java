package com.preaceleracion.project.Service;

import com.preaceleracion.project.DTO.PeliculaDTO;

import java.util.List;

public interface PeliculaService {
    PeliculaDTO save(PeliculaDTO pelicula);
    List<PeliculaDTO> getAllPelicula();
}
