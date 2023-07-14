/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.entity.Alergia;
import java.util.List;

/**
 *
 * @author jdmat
 */
public interface IAlergiaService {

    List<Alergia> obtenerAlergia();

    Alergia obtenerAlergiaPorId(Long idAlergia);

    Alergia guardarAlergia(Alergia Alergia);

    void eliminarAlergia(Long idAlergia);
}
