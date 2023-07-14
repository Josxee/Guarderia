/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Autorizado;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.repository.AutorizadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author jdmat
 */
@Service
public class AutorizadoService implements IAutorizadoService {
    
     private final AutorizadoRepository autorizadoRepository;
    
         @Autowired
    public AutorizadoService(AutorizadoRepository autorizadoRepository) {
        this.autorizadoRepository = autorizadoRepository;
    }
     
     
    @Override
    public List<Autorizado> obtenerAutorizado() {
        return (List<Autorizado>) autorizadoRepository.findAll();
    }

    @Override
    public Autorizado obtenerAutorizadoPorcedula(Long cedulaAutorizado) {
        return autorizadoRepository.findById(cedulaAutorizado).orElse(null);
    }

    @Override
    public Autorizado guardarAutorizado(Autorizado autorizado) {
         return autorizadoRepository.save(autorizado);
    }

    @Override
    public void eliminarAutorizado(Long cedulaAutorizado) {
        autorizadoRepository.deleteById(cedulaAutorizado);
    }

}
