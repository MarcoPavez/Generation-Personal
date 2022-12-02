package com.re_ejercitar.re_ejercitar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="TipoProducto")
public class TipoProducto {
    @Id
    @GeneratedValue
    private Integer tipoProducto_id;
    private String grupoAlimenticio;
    private Boolean aptoVegetarianos;
    private Boolean aptoVeganos;
    

    public TipoProducto() {
    }


    public TipoProducto(Integer tipoProducto_id, String grupoAlimenticio, Boolean aptoVegetarianos,
            Boolean aptoVeganos) {
        this.tipoProducto_id = tipoProducto_id;
        this.grupoAlimenticio = grupoAlimenticio;
        this.aptoVegetarianos = aptoVegetarianos;
        this.aptoVeganos = aptoVeganos;
    }


    public Integer getTipoProducto_id() {
        return tipoProducto_id;
    }


    public void setTipoProducto_id(Integer tipoProducto_id) {
        this.tipoProducto_id = tipoProducto_id;
    }


    public String getGrupoAlimenticio() {
        return grupoAlimenticio;
    }


    public void setGrupoAlimenticio(String grupoAlimenticio) {
        this.grupoAlimenticio = grupoAlimenticio;
    }


    public Boolean getAptoVegetarianos() {
        return aptoVegetarianos;
    }


    public void setAptoVegetarianos(Boolean aptoVegetarianos) {
        this.aptoVegetarianos = aptoVegetarianos;
    }


    public Boolean getAptoVeganos() {
        return aptoVeganos;
    }


    public void setAptoVeganos(Boolean aptoVeganos) {
        this.aptoVeganos = aptoVeganos;
    }

    
}
