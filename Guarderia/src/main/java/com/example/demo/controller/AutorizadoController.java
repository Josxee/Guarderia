/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;


import com.example.demo.entity.Autorizado;
import com.example.demo.services.IAutorizadoService;
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
public class AutorizadoController {
    @Autowired
    private IAutorizadoService autorizadoService;
    
        @GetMapping("/autorizados")
    public String mostrarUsuarios(Model model) {
        List<Autorizado> autorizado = autorizadoService.obtenerAutorizado();
        model.addAttribute("autorizado", autorizado);
        return "autorizados";
    }
}
