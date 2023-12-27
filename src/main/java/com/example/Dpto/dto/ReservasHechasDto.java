package com.example.Dpto.dto;

import com.example.Dpto.model.Alojamiento;
import com.example.Dpto.model.Inquilino;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservasHechasDto {
    private Long id;
    private LocalDate fechaEnLaQueFueHecha;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private Double segna;
    private InquilinoDto inquilinoQueReserva;

}
