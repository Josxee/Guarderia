/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.PlatoIngrediente;
import com.example.demo.services.IPlatoIngredienteService;
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
public class PlatoIngredienteController {
     @Autowired
    private IPlatoIngredienteService platoService;
 @GetMapping("/platoIngredientes")
    public String mostrarUsuarios(Model model) {
        List<PlatoIngrediente> platoIngrediente = platoService.obtenerPlatoIngrediente();
        model.addAttribute("platoIngrediente", platoIngrediente);
        return "platoIngredientes";
    }  
}
