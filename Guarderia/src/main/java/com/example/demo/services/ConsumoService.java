/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Consumo;
import com.example.demo.repository.ConsumoRepository;
import com.example.demo.repository.MenuPlatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class ConsumoService implements IConsumoService {

    private final ConsumoRepository ConsumoRepository;

    @Autowired
    public ConsumoService(ConsumoRepository ConsumoRepository) {
        this.ConsumoRepository = ConsumoRepository;
    }

    @Override
    public List<Consumo> obtenerConsumo() {
        return (List<Consumo>) ConsumoRepository.findAll();
    }

    @Override
    public Consumo obtenerConsumoPorId(Long idConsumo) {
        return ConsumoRepository.findById(idConsumo).orElse(null);
    }

    @Override
    public Consumo guardarConsumo(Consumo Consumo) {
        return ConsumoRepository.save(Consumo);
    }

    @Override
    public void eliminarConsumo(Long idConsumo) {
        ConsumoRepository.deleteById(idConsumo);
    }
}
