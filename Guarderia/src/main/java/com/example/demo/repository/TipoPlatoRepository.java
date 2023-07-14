package com.example.demo.repository;

import com.example.demo.entity.TipoPlato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPlatoRepository extends JpaRepository<TipoPlato, Long> {
}
