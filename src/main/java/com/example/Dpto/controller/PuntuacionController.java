package com.example.Dpto.controller;

import com.example.Dpto.dto.PuntuacionDto;
import com.example.Dpto.model.Puntuacion;
import com.example.Dpto.service.PuntuacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/puntuacion")
public class PuntuacionController {

    @Autowired
    private PuntuacionService puntuacionService;

    @PostMapping
    public ResponseEntity<?> crearPuntuacion(@RequestBody PuntuacionDto puntuacionDto) {
        puntuacionService.crearPuntuacion(puntuacionDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PuntuacionDto getPuntuacion(@PathVariable Long id) {
        return puntuacionService.leerPuntuacion(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarPuntuacion(@RequestBody PuntuacionDto puntuacionDto) {
        puntuacionService.modificarPuntuacion(puntuacionDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPuntuacion(@PathVariable Long id) {
        puntuacionService.eliminarPuntuacion(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<PuntuacionDto> getTodosPuntuacion() {
        return puntuacionService.getTodos();
    }
}
