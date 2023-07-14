/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.MenuPlato;
import com.example.demo.services.IMenuPlatoService;
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
public class MenuPlatoController {
       @Autowired
    private IMenuPlatoService MenuPlatoService;
 @GetMapping("/menuPlato")
    public String mostrarUsuarios(Model model) {
        List<MenuPlato> menuPlato = MenuPlatoService.obtenerMenuPlato();
        model.addAttribute("menuPlato", menuPlato);
        return "menuPlato";
    }   
}
