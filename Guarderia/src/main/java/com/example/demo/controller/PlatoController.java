/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Plato;
import com.example.demo.services.IPlatoService;
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
public class PlatoController {
  @Autowired
    private IPlatoService platoService;

@GetMapping("/platos")
    public String mostrarUsuarios(Model model) {
        List<Plato> plato = platoService.obtenerPlato();
        model.addAttribute("plato", plato);
        return "platos";
    }  
}
