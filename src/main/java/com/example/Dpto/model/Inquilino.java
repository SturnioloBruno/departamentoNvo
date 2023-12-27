package com.example.Dpto.model;

import com.example.Dpto.util.EstadoCivil;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "inquilino")
@Data
public class Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(unique = true)
    private String dni;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaDeNacimiento;
    private String domicilio;
    private String ciudad;
    private String provincia;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_civil")
    private EstadoCivil estadoCivil;
    private String ocupacion;
    private String telefono;
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "inquilino", cascade = CascadeType.ALL)
    private Set<Puntuacion> puntuaciones;
    @OneToMany(mappedBy = "inquilinoQueReserva", cascade = CascadeType.ALL)
    private Set<ReservasHechas> reservasHechas;
}
