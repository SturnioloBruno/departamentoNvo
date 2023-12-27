package com.example.Dpto.controller;

import com.example.Dpto.dto.ReservasHechasDto;
import com.example.Dpto.service.ReservasHechasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/reservas")
public class ReservasHechasController {

    @Autowired
    private ReservasHechasService reservasHechasService;

    @PostMapping
    public ResponseEntity<?> crearReserva(@RequestBody ReservasHechasDto reservasHechasDto) {
        reservasHechasService.crearReserva(reservasHechasDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ReservasHechasDto getReserva(@PathVariable Long id) {
        return reservasHechasService.leerReserva(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarReserva(@RequestBody ReservasHechasDto reservasHechasDto) {
        reservasHechasService.modificarReserva(reservasHechasDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteReserva(@PathVariable Long id) {
        reservasHechasService.eliminarReserva(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<ReservasHechasDto> getTodosReservas() {
        return reservasHechasService.getTodos();
    }
}
