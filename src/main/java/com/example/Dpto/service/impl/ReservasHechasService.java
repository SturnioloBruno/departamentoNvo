package com.example.Dpto.service.impl;

import com.example.Dpto.repository.ReservasHechasRepository;
import com.example.Dpto.dto.ReservasHechasDto;
import com.example.Dpto.model.ReservasHechas;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReservasHechasService implements com.example.Dpto.service.ReservasHechasService {

    @Autowired
    private ReservasHechasRepository reservasHechasRepository;

    @Autowired
    private ObjectMapper mapper;

    private void guardarReserva(ReservasHechasDto reservasHechasDto) {
        ReservasHechas reservasHechas = mapper.convertValue(reservasHechasDto, ReservasHechas.class);
        reservasHechasRepository.save(reservasHechas);
    }
    @Override
    public void crearReserva(ReservasHechasDto reservasHechasDto) {
        guardarReserva(reservasHechasDto);
    }

    @Override
    public ReservasHechasDto leerReserva(Long id) {
        ReservasHechas reservasHechas = reservasHechasRepository.findById(id).orElseThrow();
        return mapper.convertValue(reservasHechas, ReservasHechasDto.class);
    }

    @Override
    public void modificarReserva(ReservasHechasDto reservasHechasDto) {
        guardarReserva(reservasHechasDto);
    }

    @Override
    public void eliminarReserva(Long id) {
        reservasHechasRepository.deleteById(id);
    }

    @Override
    public Set<ReservasHechasDto> getTodos() {
        Set<ReservasHechasDto> reservasHechasDtos = new HashSet<>();
        Iterable<ReservasHechas> reservasHechas = reservasHechasRepository.findAll();

        for (ReservasHechas reserva : reservasHechas) {
            reservasHechasDtos.add(mapper.convertValue(reserva, ReservasHechasDto.class));
        }

        return reservasHechasDtos;
    }
}
