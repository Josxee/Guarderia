/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.PlatoIngrediente;
import com.example.demo.repository.PlatoIngredienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class PlatoIngredienteService implements IPlatoIngredienteService {

    private final PlatoIngredienteRepository platoIngredienteRepository;

    @Autowired
    public PlatoIngredienteService(PlatoIngredienteRepository platoIngredienteRepository) {
        this.platoIngredienteRepository = platoIngredienteRepository;
    }

    @Override
    public List<PlatoIngrediente> obtenerPlatoIngrediente() {
        return (List<PlatoIngrediente>) platoIngredienteRepository.findAll();
    }

    @Override
    public PlatoIngrediente obtenerPlatoIngredientePorId(Long idPlatoIngrediente) {
        return platoIngredienteRepository.findById(idPlatoIngrediente).orElse(null);
    }

    @Override
    public PlatoIngrediente guardarPlatoIngrediente(PlatoIngrediente platoIngrediente) {
        return platoIngredienteRepository.save(platoIngrediente);
    }

    @Override
    public void eliminarPlatoIngrediente(Long idPlatoIngrediente) {
        platoIngredienteRepository.deleteById(idPlatoIngrediente);
    }

}
