package com.example.Dpto.dto;

import com.example.Dpto.model.Alojamiento;
import com.example.Dpto.model.Inquilino;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class PuntuacionDto {
    private Double nota;
    private String observacion;
    private InquilinoDto inquilino;
    private AlojamientoDto estanciaPuntuada;
}
