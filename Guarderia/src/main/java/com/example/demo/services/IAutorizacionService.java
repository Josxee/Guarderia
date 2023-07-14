/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Autorizacion;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IAutorizacionService {
    
List<Autorizacion> obtenerAutorizacion();

    Autorizacion obtenerAutorizacionPorcedula(Long cedulaAutorizacion);

    Autorizacion guardarAutorizacion(Autorizacion autorizacion);

    void eliminarAutorizacion(Long cedulaAutorizacion);
}