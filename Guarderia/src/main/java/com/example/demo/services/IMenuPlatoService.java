/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.MenuPlato;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IMenuPlatoService {
  List<MenuPlato> obtenerMenuPlato();

    MenuPlato obtenerMenuPlatoPorId(Long idMenuPlato);

    MenuPlato guardarMenuPlato(MenuPlato MenuPlato);

    void eliminarMenuPlato(Long idMenuPlato);  
}
