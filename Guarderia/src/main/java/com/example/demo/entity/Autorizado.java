
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TBautorizado")
@Entity
public class Autorizado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CEDULAAUTORIZADO;
    private String NOMBREAUTORIZADO;
    private String PRIMERAPELLIDOAUTORIZADO;
    private String SEGUNDOAPELLIDOAUTORIZADO;
    private String DIRECCION;
    private int TELEFONO;
    private char RESPONSABLEPAGO;

    public Long getCEDULAAUTORIZADO() {
        return CEDULAAUTORIZADO;
    }

    public void setCEDULAAUTORIZADO(Long CEDULAAUTORIZADO) {
        this.CEDULAAUTORIZADO = CEDULAAUTORIZADO;
    }

    public String getNOMBREAUTORIZADO() {
        return NOMBREAUTORIZADO;
    }

    public void setNOMBREAUTORIZADO(String NOMBREAUTORIZADO) {
        this.NOMBREAUTORIZADO = NOMBREAUTORIZADO;
    }

    public String getPRIMERAPELLIDOAUTORIZADO() {
        return PRIMERAPELLIDOAUTORIZADO;
    }

    public void setPRIMERAPELLIDOAUTORIZADO(String PRIMERAPELLIDOAUTORIZADO) {
        this.PRIMERAPELLIDOAUTORIZADO = PRIMERAPELLIDOAUTORIZADO;
    }

    public String getSEGUNDOAPELLIDOAUTORIZADO() {
        return SEGUNDOAPELLIDOAUTORIZADO;
    }

    public void setSEGUNDOAPELLIDOAUTORIZADO(String SEGUNDOAPELLIDOAUTORIZADO) {
        this.SEGUNDOAPELLIDOAUTORIZADO = SEGUNDOAPELLIDOAUTORIZADO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public char getRESPONSABLEPAGO() {
        return RESPONSABLEPAGO;
    }

    public void setRESPONSABLEPAGO(char RESPONSABLEPAGO) {
        this.RESPONSABLEPAGO = RESPONSABLEPAGO;
    }

}
