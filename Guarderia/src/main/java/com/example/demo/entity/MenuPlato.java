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
 *
 * @author jdmat
 */
@Table(name = "TBmenuplato")
@Entity
public class MenuPlato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDMENUPLATO;
    private Long IDPLATO;
    private Long IDMENU;

    public Long getIDMENUPLATO() {
        return IDMENUPLATO;
    }

    public void setIDMENUPLATO(Long IDMENUPLATO) {
        this.IDMENUPLATO = IDMENUPLATO;
    }

    public Long getIDPLATO() {
        return IDPLATO;
    }

    public void setIDPLATO(Long IDPLATO) {
        this.IDPLATO = IDPLATO;
    }

    public Long getIDMENU() {
        return IDMENU;
    }

    public void setIDMENU(Long IDMENU) {
        this.IDMENU = IDMENU;
    }

}
