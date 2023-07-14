package com.example.demo.services;

import com.example.demo.entity.TipoPlato;
import com.example.demo.repository.TipoPlatoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPlatoService implements ITipoPlatoService {

    private final TipoPlatoRepository tipoPlatoRepository;

    @Autowired
    public TipoPlatoService(TipoPlatoRepository tipoPlatoRepository) {
        this.tipoPlatoRepository = tipoPlatoRepository;
    }

    @Override
    public List<TipoPlato> obtenerTiposPlato() {
        return tipoPlatoRepository.findAll();
    }

    @Override
    public TipoPlato obtenerTipoPlatoPorId(Long idTipoPlato) {
        return tipoPlatoRepository.findById(idTipoPlato).orElse(null);
    }

    @Override
    public TipoPlato guardarTipoPlato(TipoPlato tipoPlato) {
        return tipoPlatoRepository.save(tipoPlato);
    }

    @Override
    public void eliminarTipoPlato(Long idTipoPlato) {
        tipoPlatoRepository.deleteById(idTipoPlato);
    }
}
