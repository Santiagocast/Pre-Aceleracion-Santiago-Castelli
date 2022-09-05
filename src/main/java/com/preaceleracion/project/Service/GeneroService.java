package com.preaceleracion.project.Service;

import com.preaceleracion.project.DTO.GeneroDTO;
import com.preaceleracion.project.entity.Genero;

import java.util.List;

public interface GeneroService {
    GeneroDTO save (GeneroDTO genero);
    List<GeneroDTO> getAllGeneros();
}
