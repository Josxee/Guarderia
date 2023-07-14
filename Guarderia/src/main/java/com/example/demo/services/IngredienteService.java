/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Ingrediente;
import com.example.demo.repository.IngredienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class IngredienteService implements IIngredienteService {

    private final IngredienteRepository ingredienteRepository;

    @Autowired
    public IngredienteService(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    @Override
    public List<Ingrediente> obtenerIngrediente() {
        return (List<Ingrediente>) ingredienteRepository.findAll();
    }

    @Override
    public Ingrediente obtenerIngredientePorId(Long idIngrediente) {
        return ingredienteRepository.findById(idIngrediente).orElse(null);
    }

    @Override
    public Ingrediente guardarIngrediente(Ingrediente ingrediente) {
        return ingredienteRepository.save(ingrediente);
    }

    @Override
    public void eliminarIngrediente(Long idIngrediente) {
        ingredienteRepository.deleteById(idIngrediente);
    }
}
