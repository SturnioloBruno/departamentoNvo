package com.example.Dpto.controller;

import com.example.Dpto.dto.AlojamientoDto;
import com.example.Dpto.service.AlojamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/estancias")
public class AlojamientoController {

    @Autowired
    private AlojamientoService alojamientoService;

    @PostMapping
    public ResponseEntity<?> crearAlojamiento(@RequestBody AlojamientoDto alojamientoDto) {
        alojamientoService.crearEstancia(alojamientoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public AlojamientoDto getAlojamiento(@PathVariable Long id) {
        return alojamientoService.leerEstancia(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarAlojamiento(@RequestBody AlojamientoDto alojamientoDto) {
        alojamientoService.modificarEstancia(alojamientoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAlojamiento(@PathVariable Long id) {
        alojamientoService.eliminarEstancia(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<AlojamientoDto> getTodosAlojamientos() {
        return alojamientoService.getTodos();
    }
}
