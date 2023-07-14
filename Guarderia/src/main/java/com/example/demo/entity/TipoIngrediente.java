/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class for the TipoIngrediente table.
 */
@Table(name = "TBtipoingrediente")
@Entity
public class TipoIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipoingrediente;
    private String nombre;

    public Long getIdTipoIngrediente() {
        return idtipoingrediente;
    }

    public void setIdTipoIngrediente(Long idTipoIngrediente) {
        this.idtipoingrediente = idTipoIngrediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
