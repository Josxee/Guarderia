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
@Table(name = "TBingrediente")
@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDINGREDIENTE;
    private String NOMBRE;
    private Long IDTIPOINGREDIENTE;

    public Long getIDINGREDIENTE() {
        return IDINGREDIENTE;
    }

    public void setIDINGREDIENTE(Long IDINGREDIENTE) {
        this.IDINGREDIENTE = IDINGREDIENTE;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public Long getIDTIPOINGREDIENTE() {
        return IDTIPOINGREDIENTE;
    }

    public void setIDTIPOINGREDIENTE(Long IDTIPOINGREDIENTE) {
        this.IDTIPOINGREDIENTE = IDTIPOINGREDIENTE;
    }

}
