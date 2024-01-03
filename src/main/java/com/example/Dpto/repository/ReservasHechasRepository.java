package com.example.Dpto.repository;

import com.example.Dpto.model.ReservasHechas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasHechasRepository extends CrudRepository<ReservasHechas, Long> {
}
