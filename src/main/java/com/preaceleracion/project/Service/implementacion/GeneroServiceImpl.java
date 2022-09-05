package com.preaceleracion.project.Service.implementacion;

import com.preaceleracion.project.DTO.GeneroDTO;
import com.preaceleracion.project.Repository.GeneroRepository;
import com.preaceleracion.project.Service.GeneroService;
import com.preaceleracion.project.entity.Genero;
import com.preaceleracion.project.mapper.GeneroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImpl implements GeneroService {

    @Autowired
    private GeneroMapper generoMapper;
    @Autowired
    private GeneroRepository generoRepository;
    public GeneroDTO save(GeneroDTO dto){
        Genero genero  = generoMapper.generoDTOToEntity(dto);
        Genero generoGuardado = generoRepository.save(genero);
        GeneroDTO result = generoMapper.entityToGenero(generoGuardado);
        return result;
    }

    public List<GeneroDTO> getAllGeneros() {
        List<Genero> entities = this.generoRepository.findAll();
        List<GeneroDTO> result = generoMapper.generoListToList(entities);
        return result;
    }
}
