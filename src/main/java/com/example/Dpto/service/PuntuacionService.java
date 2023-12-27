package com.example.Dpto.service;

import com.example.Dpto.dto.InquilinoDto;
import com.example.Dpto.dto.PuntuacionDto;

import java.util.Set;

public interface PuntuacionService {
    void crearPuntuacion(PuntuacionDto puntuacionDto);
    PuntuacionDto leerPuntuacion(Long id);
    void modificarPuntuacion(PuntuacionDto puntuacionDto);
    void eliminarPuntuacion(Long id);
    Set<PuntuacionDto> getTodos();
}
