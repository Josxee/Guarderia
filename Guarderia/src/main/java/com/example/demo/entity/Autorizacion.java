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

@Table(name = "TBrelacionautorizacion")
@Entity
public class Autorizacion {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IDRELACION;
    private int CEDULANINO;
    private int CEDULAAUTORIZADO;
    private String RELACION;

    public Long getIDRELACION() {
        return IDRELACION;
    }

    public void setIDRELACION(Long IDRELACION) {
        this.IDRELACION = IDRELACION;
    }

    public int getCEDULANINO() {
        return CEDULANINO;
    }

    public void setCEDULANINO(int CEDULANINO) {
        this.CEDULANINO = CEDULANINO;
    }

    public int getCEDULAAUTORIZADO() {
        return CEDULAAUTORIZADO;
    }

    public void setCEDULAAUTORIZADO(int CEDULAAUTORIZADO) {
        this.CEDULAAUTORIZADO = CEDULAAUTORIZADO;
    }

    public String getRELACION() {
        return RELACION;
    }

    public void setRELACION(String RELACION) {
        this.RELACION = RELACION;
    }
    
    
    
}
