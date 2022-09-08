package com.preaceleracion.project.Repository;


import com.preaceleracion.project.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje,Long> {
}
