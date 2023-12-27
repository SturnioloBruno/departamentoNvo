package com.example.Dpto.dto;

import com.example.Dpto.model.Inquilino;
import com.example.Dpto.util.EstadoCivil;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.time.LocalDate;
@Data
public class InquilinoDto {
    private Long id;
    private String nombreCompleto;
    private String dni;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaDeNacimiento;
    private String domicilio;
    private String ciudad;
    private String provincia;
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
    private String ocupacion;
    private String telefono;
    @Email
    private String email;
    private Double puntuacionPromedio;

    private void calcularPuntuacionPromedio(Inquilino inquilino) {
        this.puntuacionPromedio = 0.0;
    }

}
