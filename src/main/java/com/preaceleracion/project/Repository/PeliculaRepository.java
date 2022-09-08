package com.preaceleracion.project.Repository;

import com.preaceleracion.project.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {
}
