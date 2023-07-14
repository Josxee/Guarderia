/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.services.IAutorizacionService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.entity.Autorizacion;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author jdmat
 */
@Controller
public class AutorizacionController {
        @Autowired
    private IAutorizacionService autorizacionService;
    
        @GetMapping("/autorizaciones")
    public String mostrarUsuarios(Model model) {
        List<Autorizacion> autorizacion = autorizacionService.obtenerAutorizacion();
        model.addAttribute("autorizacion", autorizacion);
        return "autorizaciones";
    }
}
