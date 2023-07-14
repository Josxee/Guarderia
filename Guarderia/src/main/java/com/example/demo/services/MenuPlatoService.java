/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.MenuPlato;
import com.example.demo.repository.MenuPlatoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class MenuPlatoService implements IMenuPlatoService{
    
    private final MenuPlatoRepository MenuPlatoRepository;

    @Autowired
    public MenuPlatoService(MenuPlatoRepository MenuPlatoRepository) {
        this.MenuPlatoRepository = MenuPlatoRepository;
    }

    @Override
    public List<MenuPlato> obtenerMenuPlato() {
        return (List<MenuPlato>) MenuPlatoRepository.findAll();
    }

    @Override
    public MenuPlato obtenerMenuPlatoPorId(Long idMenuPlato) {
        return MenuPlatoRepository.findById(idMenuPlato).orElse(null);
    }

    @Override
    public MenuPlato guardarMenuPlato(MenuPlato Menu) {
        return MenuPlatoRepository.save(Menu);
    }

    @Override
    public void eliminarMenuPlato(Long idMenuPlato) {
        MenuPlatoRepository.deleteById(idMenuPlato);
    }
}
