package com.example.Dpto.dao;

import com.example.Dpto.model.Puntuacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntuacionRepository extends CrudRepository<Puntuacion, Long> {
}
