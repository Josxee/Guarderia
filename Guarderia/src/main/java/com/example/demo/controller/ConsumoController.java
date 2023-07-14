/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;
import com.example.demo.services.IConsumoService;
import com.example.demo.entity.Consumo;
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
public class ConsumoController {
  @Autowired
    private IConsumoService ConsumoService;
 @GetMapping("/consumos")
    public String mostrarUsuarios(Model model) {
        List<Consumo> consumo = ConsumoService.obtenerConsumo();
        model.addAttribute("consumo", consumo);
        return "consumos";
    }     
}
