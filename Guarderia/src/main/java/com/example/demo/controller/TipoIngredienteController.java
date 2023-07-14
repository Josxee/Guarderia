/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.TipoIngrediente;
import com.example.demo.services.ITipoIngredienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller class for TipoIngrediente entity.
 */
@Controller
public class TipoIngredienteController {

    @Autowired
    private ITipoIngredienteService tipoIngredienteService;

    @GetMapping("/tipoingrediente")
    public String mostrarTiposIngrediente(Model model) {
        List<TipoIngrediente> tiposIngrediente = tipoIngredienteService.obtenerTiposIngrediente();
        model.addAttribute("tiposIngrediente", tiposIngrediente);
        return "tipoingrediente";
    }

}
