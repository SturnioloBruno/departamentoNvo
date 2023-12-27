package com.example.Dpto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "reservas_hechas")
@Data
public class ReservasHechas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_en_la_que_fue_hecha")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaEnLaQueFueHecha;
    @Column(name = "fecha_desde")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaDesde;
    @Column(name = "fecha_hasta")
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaHasta;
    private Double segna;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "inquilino_id", nullable = false)
    private Inquilino inquilinoQueReserva;
    @OneToOne(mappedBy = "reserva", optional = true)
    private Alojamiento alojamientoConcretado;
}
