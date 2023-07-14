/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.PlatoIngrediente;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IPlatoIngredienteService {
    List<PlatoIngrediente> obtenerPlatoIngrediente();

    PlatoIngrediente obtenerPlatoIngredientePorId(Long idPlatoIngrediente);

    PlatoIngrediente guardarPlatoIngrediente(PlatoIngrediente platoIngrediente);

    void eliminarPlatoIngrediente(Long idPlatoIngrediente);
}
