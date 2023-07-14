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

@Table(name = "TBplato")
@Entity
public class Plato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDPLATO;
    private String NOMBRE;
    private int IDTIPOPLATO;

    public Long getIDPLATO() {
        return IDPLATO;
    }

    public void setIDPLATO(Long IDPLATO) {
        this.IDPLATO = IDPLATO;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getIDTIPOPLATO() {
        return IDTIPOPLATO;
    }

    public void setIDTIPOPLATO(int IDTIPOPLATO) {
        this.IDTIPOPLATO = IDTIPOPLATO;
    }

}
