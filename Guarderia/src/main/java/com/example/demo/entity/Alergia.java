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
@Table(name = "TBalergia")
@Entity
public class Alergia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDALERGIA;
    private Long CEDULANINO;
    private Long IDINGREDIENTE;

    public Long getIDALERGIA() {
        return IDALERGIA;
    }

    public void setIDALERGIA(Long IDALERGIA) {
        this.IDALERGIA = IDALERGIA;
    }

    public Long getCEDULANINO() {
        return CEDULANINO;
    }

    public void setCEDULANINO(Long CEDULANINO) {
        this.CEDULANINO = CEDULANINO;
    }

    public Long getIDINGREDIENTE() {
        return IDINGREDIENTE;
    }

    public void setIDINGREDIENTE(Long IDINGREDIENTE) {
        this.IDINGREDIENTE = IDINGREDIENTE;
    }

}
