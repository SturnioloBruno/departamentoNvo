package com.example.Dpto.service.impl;

import com.example.Dpto.repository.PuntuacionRepository;
import com.example.Dpto.dto.PuntuacionDto;
import com.example.Dpto.model.Puntuacion;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PuntuacionService implements com.example.Dpto.service.PuntuacionService {

    @Autowired
    private PuntuacionRepository puntuacionRepository;

    @Autowired
    private ObjectMapper mapper;

    private void guardarPuntuacion(PuntuacionDto puntuacionDto) {
        Puntuacion puntuacion = mapper.convertValue(puntuacionDto, Puntuacion.class);
        puntuacionRepository.save(puntuacion);
    }
    @Override
    public void crearPuntuacion(PuntuacionDto puntuacionDto) {
        guardarPuntuacion(puntuacionDto);
    }

    @Override
    public PuntuacionDto leerPuntuacion(Long id) {
        Puntuacion puntuacion = puntuacionRepository.findById(id).orElseThrow();
        return mapper.convertValue(puntuacion, PuntuacionDto.class);
    }

    @Override
    public void modificarPuntuacion(PuntuacionDto puntuacionDto) {
        guardarPuntuacion(puntuacionDto);
    }

    @Override
    public void eliminarPuntuacion(Long id) {
        puntuacionRepository.deleteById(id);
    }

    @Override
    public Set<PuntuacionDto> getTodos() {
        Set<PuntuacionDto> puntuacionDtos = new HashSet<>();
        Iterable<Puntuacion> puntuaciones = puntuacionRepository.findAll();

        for (Puntuacion puntuacion : puntuaciones) {
            puntuacionDtos.add(mapper.convertValue(puntuacion, PuntuacionDto.class));
        }

        return puntuacionDtos;
    }
}
