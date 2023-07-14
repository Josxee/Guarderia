
package com.example.demo.services;


import com.example.demo.entity.Nino;
import com.example.demo.repository.NinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinoService implements INinoService {

    private final NinoRepository ninoRepository;

    @Autowired
    public NinoService(NinoRepository ninoRepository) {
        this.ninoRepository = ninoRepository;
    }

    @Override
    public List<Nino> obtenerNino() {
        return (List<Nino>) ninoRepository.findAll();
    }

    @Override
    public Nino obtenerNinoPorcedula(Long cedulaNino) {
        return ninoRepository.findById(cedulaNino).orElse(null);
    }

    @Override
    public Nino guardarNino(Nino Nino) {
        return ninoRepository.save(Nino);
    }

    @Override
    public void eliminarNino(Long cedulaNino) {
        ninoRepository.deleteById(cedulaNino);
    }
}
