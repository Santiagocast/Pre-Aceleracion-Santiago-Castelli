package com.preaceleracion.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "pelicula")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {
    @Id
    @Column(name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;

    private String tituloPelicula;

    private String imagen;

    private LocalDate fechaCreacion;

    private Integer calificacion;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @ManyToMany(mappedBy = "peliculaAsociada")
    private List<Personaje> personajesAsociados;
}
