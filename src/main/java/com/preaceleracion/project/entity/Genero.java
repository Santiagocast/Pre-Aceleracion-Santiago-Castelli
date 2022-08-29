package com.preaceleracion.project.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import  javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "genero")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genero {
    @Id
    @Column(name = "id_genero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;
    private String nombreGenero;
    private String imagen;
    @OneToMany(mappedBy = "genero")
    private List<Pelicula> peliculasAsociadas;
}
