package com.example.Dpto.service;

import com.example.Dpto.dto.PuntuacionDto;
import com.example.Dpto.dto.ReservasHechasDto;

import java.util.Set;

public interface ReservasHechasService {
    void crearReserva(ReservasHechasDto reservasHechasDto);
    ReservasHechasDto leerReserva(Long id);
    void modificarReserva(ReservasHechasDto reservasHechasDto);
    void eliminarReserva(Long id);
    Set<ReservasHechasDto> getTodos();
}
