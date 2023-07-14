/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.ui.Model;
import com.example.demo.entity.Nino;


import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.services.INinoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NinoController {

    @Autowired
    private INinoService ninoService;

    @GetMapping("/ninos")
    public String mostrarUsuarios(Model model) {
        List<Nino> nino = ninoService.obtenerNino();
        model.addAttribute("nino", nino);
        return "ninos";
    }

}
