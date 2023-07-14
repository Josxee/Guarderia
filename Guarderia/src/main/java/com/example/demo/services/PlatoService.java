/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Plato;
import com.example.demo.repository.PlatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class PlatoService implements IPlatoService {

    private final PlatoRepository platoRepository;

    @Autowired
    public PlatoService(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    @Override
    public List<Plato> obtenerPlato() {
        return (List<Plato>) platoRepository.findAll();
    }

    @Override
    public Plato obtenerPlatoPorId(Long idPlato) {
        return platoRepository.findById(idPlato).orElse(null);
    }

    @Override
    public Plato guardarPlato(Plato plato) {
        return platoRepository.save(plato);
    }

    @Override
    public void eliminarPlato(Long idPlato) {
        platoRepository.deleteById(idPlato);
    }
}
