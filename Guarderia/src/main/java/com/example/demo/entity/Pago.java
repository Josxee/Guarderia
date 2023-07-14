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

@Table(name = "TBpago")
@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDPAGO;
    private int CEDULAAUTORIZADO;
    private int MONTOMENSUALFIJO;
    private String NUMEROCUENTA;

    public Long getIDPAGO() {
        return IDPAGO;
    }

    public void setIDPAGO(Long IDPAGO) {
        this.IDPAGO = IDPAGO;
    }

    public int getCEDULAAUTORIZADO() {
        return CEDULAAUTORIZADO;
    }

    public void setCEDULAAUTORIZADO(int CEDULAAUTORIZADO) {
        this.CEDULAAUTORIZADO = CEDULAAUTORIZADO;
    }

    public int getMONTOMENSUALFIJO() {
        return MONTOMENSUALFIJO;
    }

    public void setMONTOMENSUALFIJO(int MONTOMENSUALFIJO) {
        this.MONTOMENSUALFIJO = MONTOMENSUALFIJO;
    }

    public String getNUMEROCUENTA() {
        return NUMEROCUENTA;
    }

    public void setNUMEROCUENTA(String NUMEROCUENTA) {
        this.NUMEROCUENTA = NUMEROCUENTA;
    }

}
