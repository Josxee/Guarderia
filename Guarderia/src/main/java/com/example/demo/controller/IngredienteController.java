/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Ingrediente;
import com.example.demo.services.IIngredienteService;
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
public class IngredienteController {
    @Autowired
    private IIngredienteService ingredienteService;
    
    @GetMapping("/ingredientes")
    public String mostrarUsuarios(Model model) {
        List<Ingrediente> ingrediente = ingredienteService.obtenerIngrediente();
        model.addAttribute("ingrediente", ingrediente);
        return "ingredientes";
    }  
}
