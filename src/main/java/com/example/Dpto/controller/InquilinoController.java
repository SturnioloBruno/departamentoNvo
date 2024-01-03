package com.example.Dpto.controller;

import com.example.Dpto.dto.InquilinoDto;
import com.example.Dpto.exception.ResourceNotFoundException;
import com.example.Dpto.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/inquilinos")
public class InquilinoController {

    @Autowired
    private InquilinoService inquilinoService;

    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @PostMapping
    public ResponseEntity<?> crearInquilino(@RequestBody InquilinoDto inquilinoDto) {
        inquilinoService.crearInquilino(inquilinoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @GetMapping("/{id}")
    public InquilinoDto getInquilino(@PathVariable Long id) throws ResourceNotFoundException {
        return inquilinoService.leerInquilino(id);
    }

    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @PutMapping
    public ResponseEntity<?> modificarInquilino(@RequestBody InquilinoDto inquilinoDto) {
        inquilinoService.modificarInquilino(inquilinoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarInquilino(@PathVariable Long id) {
        inquilinoService.eliminarInquilino(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @GetMapping
    public Collection<InquilinoDto> getTodosInquilinos() {
        return inquilinoService.getTodos();
    }
}
