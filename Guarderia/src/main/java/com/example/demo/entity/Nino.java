package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Table(name = "TBnino")
@Entity
public class Nino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CEDULANINO;
    private String NOMBRENINO;
    private String PRIMERAPELLIDONINO;
    private String SEGUNDOAPELLIDONINO;
    private Date FECHANACIMIENTO;
    private Date FECHAINGRESO;
    private Date FECHABAJA;

    public Long getCEDULANINO() {
        return CEDULANINO;
    }

    public void setCEDULANINO(Long CEDULANINO) {
        this.CEDULANINO = CEDULANINO;
    }

    public String getNOMBRENINO() {
        return NOMBRENINO;
    }

    public void setNOMBRENINO(String NOMBRENINO) {
        this.NOMBRENINO = NOMBRENINO;
    }

    public String getPRIMERAPELLIDONINO() {
        return PRIMERAPELLIDONINO;
    }

    public void setPRIMERAPELLIDONINO(String PRIMERAPELLIDONINO) {
        this.PRIMERAPELLIDONINO = PRIMERAPELLIDONINO;
    }

    public String getSEGUNDOAPELLIDONINO() {
        return SEGUNDOAPELLIDONINO;
    }

    public void setSEGUNDOAPELLIDONINO(String SEGUNDOAPELLIDONINO) {
        this.SEGUNDOAPELLIDONINO = SEGUNDOAPELLIDONINO;
    }

    public Date getFECHANACIMIENTO() {
        return FECHANACIMIENTO;
    }

    public void setFECHANACIMIENTO(Date FECHANACIMIENTO) {
        this.FECHANACIMIENTO = FECHANACIMIENTO;
    }

    public Date getFECHAINGRESO() {
        return FECHAINGRESO;
    }

    public void setFECHAINGRESO(Date FECHAINGRESO) {
        this.FECHAINGRESO = FECHAINGRESO;
    }

    public Date getFECHABAJA() {
        return FECHABAJA;
    }

    public void setFECHABAJA(Date FECHABAJA) {
        this.FECHABAJA = FECHABAJA;
    }

   
}
