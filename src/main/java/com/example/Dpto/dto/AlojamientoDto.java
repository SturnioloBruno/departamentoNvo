package com.example.Dpto.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class AlojamientoDto {
    private Long id;
    private Double precio;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaDesde;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaHasta;
    /**
     * Representa la información de los inquilinos alojados en formato JSON.
     * Este campo almacena la representación JSON de un conjunto de entidades Inquilino ({@code Set<InquilinoDto>}).
     */
    private String inquilinosAlojadosJson;
}
