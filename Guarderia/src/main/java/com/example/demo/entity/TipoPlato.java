package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBtipoplato")
public class TipoPlato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipoplato;
    private String nombre;

    public Long getIdTipoPlato() {
        return idtipoplato;
    }

    public void setIdTipoPlato(Long idTipoPlato) {
        this.idtipoplato = idTipoPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
