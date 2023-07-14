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
import java.util.Date;

/**
 *
 * @author jdmat
 */
@Table(name = "TBconsumo")
@Entity

public class Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDCONSUMO;
    private Long CEDULANINO;
    private Long IDMENU;
    private Date FECHACONSUMO;

    public Long getIDCONSUMO() {
        return IDCONSUMO;
    }

    public void setIDCONSUMO(Long IDCONSUMO) {
        this.IDCONSUMO = IDCONSUMO;
    }

    public Long getCEDULANINO() {
        return CEDULANINO;
    }

    public void setCEDULANINO(Long CEDULANINO) {
        this.CEDULANINO = CEDULANINO;
    }

    public Long getIDMENU() {
        return IDMENU;
    }

    public void setIDMENU(Long IDMENU) {
        this.IDMENU = IDMENU;
    }

    public Date getFECHACONSUMO() {
        return FECHACONSUMO;
    }

    public void setFECHACONSUMO(Date FECHACONSUMO) {
        this.FECHACONSUMO = FECHACONSUMO;
    }

}
