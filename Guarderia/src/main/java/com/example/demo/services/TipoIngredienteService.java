/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.TipoIngrediente;
import com.example.demo.repository.TipoIngredienteRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for TipoIngrediente entity.
 */
@Service
public class TipoIngredienteService implements ITipoIngredienteService {

    private final TipoIngredienteRepository tipoIngredienteRepository;

    @Autowired
    public TipoIngredienteService(TipoIngredienteRepository tipoIngredienteRepository) {
        this.tipoIngredienteRepository = tipoIngredienteRepository;
    }

    @Override
    public List<TipoIngrediente> obtenerTiposIngrediente() {
        return tipoIngredienteRepository.findAll();
    }

    @Override
    public TipoIngrediente obtenerTipoIngredientePorId(Long idTipoIngrediente) {
        return tipoIngredienteRepository.findById(idTipoIngrediente).orElse(null);
    }

    @Override
    public TipoIngrediente guardarTipoIngrediente(TipoIngrediente tipoIngrediente) {
        return tipoIngredienteRepository.save(tipoIngrediente);
    }

    @Override
    public void eliminarTipoIngrediente(Long idTipoIngrediente) {
        tipoIngredienteRepository.deleteById(idTipoIngrediente);
    }

}
