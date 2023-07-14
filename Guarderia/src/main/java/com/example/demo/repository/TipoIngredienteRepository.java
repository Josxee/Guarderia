/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.TipoIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for TipoIngrediente entity.
 */
public interface TipoIngredienteRepository extends JpaRepository<TipoIngrediente, Long> {
}
