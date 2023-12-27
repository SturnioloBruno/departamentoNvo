package com.example.Dpto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "estancias")
@Data
public class Alojamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double precio;
    @Column(name = "fecha_desde")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    @Temporal(TemporalType.DATE)
    private LocalDate fechaHasta;
    @Column(columnDefinition = "TEXT")
    private String inquilinosAlojadosJson; // Almacena los inquilinos alojados en formato json,
    // para almacenarlos luego si no existen. utilizar gson para tranformar rapidamente las entidades
    @OneToOne
    @JoinColumn(name="reserva_id", nullable = true)
    private ReservasHechas reserva;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "puntuacion_id")
    private Puntuacion puntuacionAsignada;
}
