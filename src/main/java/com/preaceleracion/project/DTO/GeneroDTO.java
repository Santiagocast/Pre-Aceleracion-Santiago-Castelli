package com.preaceleracion.project.DTO;

import com.preaceleracion.project.entity.Pelicula;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GeneroDTO {
    private Long idGenero;
    private String nombreGenero;
    private String imagen;
    private List<Pelicula> peliculasAsociadas;
}
