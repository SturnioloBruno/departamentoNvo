package com.example.Dpto.repository;

import com.example.Dpto.model.Inquilino;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquilinoRepository extends CrudRepository<Inquilino, Long> {
}
