package com.example.Dpto.service.impl;

import com.example.Dpto.dao.InquilinoRepository;
import com.example.Dpto.dto.InquilinoDto;
import com.example.Dpto.model.Inquilino;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class InquilinoService implements com.example.Dpto.service.InquilinoService {

    @Autowired
    private InquilinoRepository inquilinoRepository;

    @Autowired
    private ObjectMapper mapper;

    private void guardarInquilino(InquilinoDto inquilinoDto) {
        Inquilino inquilino = mapper.convertValue(inquilinoDto, Inquilino.class);
        inquilinoRepository.save(inquilino);
    }
    @Override
    public void crearInquilino(InquilinoDto inquilinoDto) {
        guardarInquilino(inquilinoDto);
    }

    @Override
    public InquilinoDto leerInquilino(Long id) {
        Inquilino inquilino = inquilinoRepository.findById(id).orElseThrow();
        return mapper.convertValue(inquilino, InquilinoDto.class);
    }

    @Override
    public void modificarInquilino(InquilinoDto inquilinoDto) {
        guardarInquilino(inquilinoDto);
    }

    @Override
    public void eliminarInquilino(Long id) {
        inquilinoRepository.deleteById(id);
    }

    @Override
    public Set<InquilinoDto> getTodos() {
        Set<InquilinoDto> inquilinoDtos = new HashSet<>();
        Iterable<Inquilino> inquilinos = inquilinoRepository.findAll();

        for (Inquilino inquilino : inquilinos) {
            inquilinoDtos.add(mapper.convertValue(inquilino, InquilinoDto.class));
        }

        return inquilinoDtos;
    }
}
