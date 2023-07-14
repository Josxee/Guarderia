/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Alergia;
import com.example.demo.services.IAlergiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author jdmat
 */
@Controller
public class AlergiaController {
   @Autowired
    private IAlergiaService AlergiaService;
 @GetMapping("/alergia")
    public String mostrarAlergia(Model model) {
        List<Alergia> alergia = AlergiaService.obtenerAlergia();
        model.addAttribute("alergia", alergia);
        return "alergia";
    }    
}
