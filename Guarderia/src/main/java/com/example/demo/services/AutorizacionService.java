/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Autorizacion;
import com.example.demo.repository.AutorizacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class AutorizacionService implements IAutorizacionService {

    private final AutorizacionRepository autorizacionRepository;

    @Autowired
    public AutorizacionService(AutorizacionRepository autorizacionRepository) {
        this.autorizacionRepository = autorizacionRepository;
    }

    @Override
    public List<Autorizacion> obtenerAutorizacion() {
        return (List<Autorizacion>) autorizacionRepository.findAll();
    }

    @Override
    public Autorizacion obtenerAutorizacionPorcedula(Long cedulaAutorizado) {
        return autorizacionRepository.findById(cedulaAutorizado).orElse(null);
    }

    @Override
    public Autorizacion guardarAutorizacion(Autorizacion autorizacion) {
        return autorizacionRepository.save(autorizacion);
    }

    @Override
    public void eliminarAutorizacion(Long cedulaAutorizacion) {
        autorizacionRepository.deleteById(cedulaAutorizacion);
    }

}
