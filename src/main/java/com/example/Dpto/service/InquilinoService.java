package com.example.Dpto.service;

import com.example.Dpto.dto.AlojamientoDto;
import com.example.Dpto.dto.InquilinoDto;

import java.util.Set;

public interface InquilinoService {
    void crearInquilino(InquilinoDto inquilinoDto);
    InquilinoDto leerInquilino(Long id);
    void modificarInquilino(InquilinoDto inquilinoDto);
    void eliminarInquilino(Long id);
    Set<InquilinoDto> getTodos();
}
