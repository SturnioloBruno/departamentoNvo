package com.example.Dpto.service;

import com.example.Dpto.dto.AlojamientoDto;

import java.util.Set;

public interface AlojamientoService {
    void crearEstancia(AlojamientoDto alojamientoDto);
    AlojamientoDto leerEstancia(Long id);
    void modificarEstancia(AlojamientoDto alojamientoDto);
    void eliminarEstancia(Long id);
    Set<AlojamientoDto> getTodos();
}
