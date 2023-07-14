/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;
import com.example.demo.entity.Pago;
import com.example.demo.repository.PagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class PagoService implements IPagoService {

    private final PagoRepository pagoRepository;

    @Autowired
    public PagoService(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @Override
    public List<Pago> obtenerPago() {
        return (List<Pago>) pagoRepository.findAll();
    }

    @Override
    public Pago obtenerPagoPoridPago(Long idpago) {
        return pagoRepository.findById(idpago).orElse(null);
    }

    @Override
    public Pago guardarPago(Pago pago) {
        return pagoRepository.save(pago);

    }

    @Override
    public void eliminarPago(Long idpago) {
        pagoRepository.deleteById(idpago);
    }

}
