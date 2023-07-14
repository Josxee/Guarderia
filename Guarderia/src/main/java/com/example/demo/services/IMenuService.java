/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Menu;

import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IMenuService {

    List<Menu> obtenerMenu();

    Menu obtenerMenuPorid(Long idMenu);

    Menu guardarMenu(Menu menu);

    void eliminarMenu(Long idMenu);
}
