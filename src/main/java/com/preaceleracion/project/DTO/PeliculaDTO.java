package com.preaceleracion.project.DTO;


import com.preaceleracion.project.entity.Genero;
import com.preaceleracion.project.entity.Personaje;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class PeliculaDTO {
    private Long idPelicula;
    private String tituloPelicula;
    private String imagen;
    private LocalDate fechaCreacion;
    private Integer calificacion;
    private Genero genero;
    private List<Personaje> personajesAsociados;
}
