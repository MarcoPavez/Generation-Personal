package com.re_ejercitar.re_ejercitar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Proveedores")
public class Proveedores {
    @Id
    @GeneratedValue
    private Integer proveedores_id;
    private String nombreProveedor;
    private String frecuenciaVisita;
    
    
    public Proveedores() {
    }


    public Proveedores(Integer proveedores_id, String nombreProveedor, String frecuenciaVisita) {
        this.proveedores_id = proveedores_id;
        this.nombreProveedor = nombreProveedor;
        this.frecuenciaVisita = frecuenciaVisita;
    }


    public Integer getProveedores_id() {
        return proveedores_id;
    }


    public void setProveedores_id(Integer proveedores_id) {
        this.proveedores_id = proveedores_id;
    }


    public String getNombreProveedor() {
        return nombreProveedor;
    }


    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    public String getFrecuenciaVisita() {
        return frecuenciaVisita;
    }


    public void setFrecuenciaVisita(String frecuenciaVisita) {
        this.frecuenciaVisita = frecuenciaVisita;
    }

    
}
