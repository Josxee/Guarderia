/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Nino;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface INinoService {
    List<Nino> obtenerNino();
    Nino obtenerNinoPorcedula(Long cedulaNino);
    Nino guardarNino(Nino nino);
    void eliminarNino(Long cedulaNino);
}