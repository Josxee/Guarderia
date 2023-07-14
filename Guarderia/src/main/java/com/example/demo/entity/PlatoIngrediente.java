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
 * IDPLATOINGREDIENTE IDPLATO IDINGREDIENTE
 */
@Table(name = "TBplatoingrediente")
@Entity
public class PlatoIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDPLATOINGREDIENTE;
    private Long IDPLATO;
    private Long IDINGREDIENTE;

    public Long getIDPLATOINGREDIENTE() {
        return IDPLATOINGREDIENTE;
    }

    public void setIDPLATOINGREDIENTE(Long IDPLATOINGREDIENTE) {
        this.IDPLATOINGREDIENTE = IDPLATOINGREDIENTE;
    }

    public Long getIDPLATO() {
        return IDPLATO;
    }

    public void setIDPLATO(Long IDPLATO) {
        this.IDPLATO = IDPLATO;
    }

    public Long getIDINGREDIENTE() {
        return IDINGREDIENTE;
    }

    public void setIDINGREDIENTE(Long IDINGREDIENTE) {
        this.IDINGREDIENTE = IDINGREDIENTE;
    }

}
