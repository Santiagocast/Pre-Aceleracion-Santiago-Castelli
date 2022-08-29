package com.preaceleracion.project.entity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import  javax.persistence.*;

@Entity
@Table(name= "personaje")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personaje {
    @Id
    @Column(name = "id_personaje")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;

    private String nombrePersonaje;
    private String imagen;
    private Integer edad;
    private Float peso;
    private String historia;

    @ManyToMany(cascade = {
            CascadeType.ALL
    })
    @JoinTable(
            name = "personajes_en_pelicula",
            joinColumns = {@JoinColumn(name = "id_personaje")},
            inverseJoinColumns = {@JoinColumn(name = "id_pelicula")}
    )
    private List<Pelicula> peliculaAsociada;
}
