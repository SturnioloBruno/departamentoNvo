package com.example.Dpto.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "puntuacion")
@Data
public class Puntuacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nota;
    @Column(columnDefinition = "TEXT")
    private String observacion;
    @ManyToOne
    @JoinColumn(name = "inquilino_id")
    private Inquilino inquilino;
    @OneToOne
    @JoinColumn(name = "estancia_id")
    private Alojamiento estanciaPuntuada;
}
