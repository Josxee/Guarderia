/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.entity.Autorizado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jdmat
 */

public interface AutorizadoRepository extends JpaRepository<Autorizado, Long> {    
}
