/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Plato;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IPlatoService {

    List<Plato> obtenerPlato();

    Plato obtenerPlatoPorId(Long idPlato);

    Plato guardarPlato(Plato plato);

    void eliminarPlato(Long idPlato);
}
