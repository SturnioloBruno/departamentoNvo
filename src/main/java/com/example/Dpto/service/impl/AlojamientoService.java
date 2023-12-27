package com.example.Dpto.service.impl;

import com.example.Dpto.dao.AlojamientoRepository;
import com.example.Dpto.dto.AlojamientoDto;
import com.example.Dpto.model.Alojamiento;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class AlojamientoService implements com.example.Dpto.service.AlojamientoService {

    @Autowired
    private AlojamientoRepository alojamientoRepository;

    @Autowired
    private ObjectMapper mapper;

    private void guardarEstancia(AlojamientoDto alojamientoDto) {
        Alojamiento alojamiento = mapper.convertValue(alojamientoDto, Alojamiento.class);
        alojamientoRepository.save(alojamiento);
    }

    @Override
    public void crearEstancia(AlojamientoDto alojamientoDto) {
        guardarEstancia(alojamientoDto);
    }

    @Override
    public AlojamientoDto leerEstancia(Long id) {
        Alojamiento alojamiento = alojamientoRepository.findById(id).orElseThrow();
        return mapper.convertValue(alojamiento, AlojamientoDto.class);
    }

    @Override
    public void modificarEstancia(AlojamientoDto alojamientoDto) {
        guardarEstancia(alojamientoDto);
    }

    @Override
    public void eliminarEstancia(Long id) {
        alojamientoRepository.deleteById(id);
    }

    @Override
    public Set<AlojamientoDto> getTodos() {

        Set<AlojamientoDto> alojamientoDtos = new HashSet<>();
        Iterable<Alojamiento> alojamientos = alojamientoRepository.findAll();

        for (Alojamiento alojamiento : alojamientos) {
            alojamientoDtos.add(mapper.convertValue(alojamiento, AlojamientoDto.class));
        }

        return alojamientoDtos;
    }
}
