/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Autorizado;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IAutorizadoService {

    List<Autorizado> obtenerAutorizado();

    Autorizado obtenerAutorizadoPorcedula(Long cedulaAutorizado);

    Autorizado guardarAutorizado(Autorizado autorizado);

    void eliminarAutorizado(Long cedulaAutorizado);
}
