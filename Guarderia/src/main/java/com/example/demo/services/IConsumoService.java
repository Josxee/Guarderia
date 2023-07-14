/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;


import com.example.demo.entity.Consumo;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IConsumoService {
   List<Consumo> obtenerConsumo();

    Consumo obtenerConsumoPorId(Long idConsumo);

    Consumo guardarConsumo(Consumo Consumo);

    void eliminarConsumo(Long idConsumo);  
}
