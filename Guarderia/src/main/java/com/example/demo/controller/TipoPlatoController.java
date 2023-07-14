package com.example.demo.controller;

import com.example.demo.entity.TipoPlato;
import com.example.demo.services.ITipoPlatoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipoPlatoController {
    
    @Autowired
    private ITipoPlatoService tipoPlatoService;
    
    @GetMapping("/tipoPlato")
    public String mostrarTiposPlato(Model model) {
        List<TipoPlato> tiposPlato = tipoPlatoService.obtenerTiposPlato();
        model.addAttribute("tiposPlato", tiposPlato);
        return "tipoPlato";
    }
}
