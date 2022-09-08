package com.preaceleracion.project.DTO;


import com.preaceleracion.project.entity.Pelicula;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonajeDTO {
    private  long idPersonaje;
    private String nombrePersonaje;
    private String imagen;
    private Integer edad;
    private Float peso;
    private String historia;
    private List<Pelicula> peliculaAsociada;
}
