package com.example.Dpto.repository;

import com.example.Dpto.model.Alojamiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlojamientoRepository extends CrudRepository<Alojamiento, Long> {
}
