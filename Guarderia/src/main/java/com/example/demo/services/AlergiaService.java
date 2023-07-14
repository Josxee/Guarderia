/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Alergia;
import com.example.demo.repository.AlergiaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class AlergiaService implements IAlergiaService {

    private final AlergiaRepository AlergiaRepository;

    @Autowired
    public AlergiaService(AlergiaRepository AlergiaRepository) {
        this.AlergiaRepository = AlergiaRepository;
    }

    @Override
    public List<Alergia> obtenerAlergia() {
        return (List<Alergia>) AlergiaRepository.findAll();
    }

    @Override
    public Alergia obtenerAlergiaPorId(Long idAlergia) {
        return AlergiaRepository.findById(idAlergia).orElse(null);
    }

    @Override
    public Alergia guardarAlergia(Alergia Alergia) {
        return AlergiaRepository.save(Alergia);
    }

    @Override
    public void eliminarAlergia(Long idAlergia) {
        AlergiaRepository.deleteById(idAlergia);
    }

}
