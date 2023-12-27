package com.example.Dpto.service;

import com.example.Dpto.dto.AlojamientoDto;
import com.example.Dpto.dto.InquilinoDto;
import com.example.Dpto.exception.ResourceNotFoundException;

import java.util.Set;

public interface InquilinoService {
    void crearInquilino(InquilinoDto inquilinoDto);
    InquilinoDto leerInquilino(Long id) throws ResourceNotFoundException;
    void modificarInquilino(InquilinoDto inquilinoDto);
    void eliminarInquilino(Long id);
    Set<InquilinoDto> getTodos();
}
