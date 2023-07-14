/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Ingrediente;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IIngredienteService {
    List<Ingrediente> obtenerIngrediente();

    Ingrediente obtenerIngredientePorId(Long idIngrediente);

    Ingrediente guardarIngrediente(Ingrediente ingrediente);

    void eliminarIngrediente(Long idIngrediente);
}
