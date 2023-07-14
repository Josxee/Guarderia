/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.entity.Menu;
import com.example.demo.services.IMenuService;
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
public class MenuController {
     @Autowired
    private IMenuService menuService;

    @GetMapping("/menus")
    public String mostrarUsuarios(Model model) {
        List<Menu> menu = menuService.obtenerMenu();
        model.addAttribute("menu", menu);
        return "menus";
    }   
}
