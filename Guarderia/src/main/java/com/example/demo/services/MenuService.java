/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.repository.MenuRepository;
import com.example.demo.entity.Menu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jdmat
 */
@Service
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> obtenerMenu() {
        return (List<Menu>) menuRepository.findAll();
    }

    @Override
    public Menu obtenerMenuPorid(Long idMenu) {
        return menuRepository.findById(idMenu).orElse(null);
    }

    @Override
    public Menu guardarMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public void eliminarMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

}
