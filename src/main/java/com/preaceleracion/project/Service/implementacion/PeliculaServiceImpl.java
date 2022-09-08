package com.preaceleracion.project.Service.implementacion;


import com.preaceleracion.project.DTO.PeliculaDTO;
import com.preaceleracion.project.Repository.PeliculaRepository;
import com.preaceleracion.project.Service.PeliculaService;
import com.preaceleracion.project.entity.Pelicula;
import com.preaceleracion.project.mapper.PeliculaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaMapper peliculaMapper;
    @Autowired
    private PeliculaRepository peliculaRepository;

    public PeliculaDTO save(PeliculaDTO dto){
        Pelicula pelicula = peliculaMapper.peliculaDTOToEntity(dto);
        Pelicula peliuclaGuardado = peliculaRepository.save(pelicula);
        PeliculaDTO result = peliculaMapper.entityToPeliculaDTO(peliuclaGuardado);
        return result;
    }

    public List<PeliculaDTO> getAllPelicula() {
        List<Pelicula> entities = this.peliculaRepository.findAll();
        List<PeliculaDTO> result = peliculaMapper.peliculaListToList(entities);
        return result;
    }
}
