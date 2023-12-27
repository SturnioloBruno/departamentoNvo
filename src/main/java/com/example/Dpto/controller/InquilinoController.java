package com.example.Dpto.controller;

import com.example.Dpto.dto.InquilinoDto;
import com.example.Dpto.exception.ResourceNotFoundException;
import com.example.Dpto.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/inquilinos")
public class InquilinoController {

    @Autowired
    private InquilinoService inquilinoService;

    @PostMapping
    public ResponseEntity<?> crearInquilino(@RequestBody InquilinoDto inquilinoDto) {
        inquilinoService.crearInquilino(inquilinoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public InquilinoDto getInquilino(@PathVariable Long id) throws ResourceNotFoundException {
        return inquilinoService.leerInquilino(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarInquilino(@RequestBody InquilinoDto inquilinoDto) {
        inquilinoService.modificarInquilino(inquilinoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarInquilino(@PathVariable Long id) {
        inquilinoService.eliminarInquilino(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<InquilinoDto> getTodosInquilinos() {
        return inquilinoService.getTodos();
    }
}
