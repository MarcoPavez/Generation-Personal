package com.re_ejercitar.re_ejercitar.model;

import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="Productos")
public class Productos {
    @Id
    @GeneratedValue
    private int id;
    private String nombreProducto;
    @Range(min=0)
    private int precioProducto;
    @Range(min=0)
    private int stock;
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name="BoletaCompra",
        joinColumns = @JoinColumn(name="producto_id"),
        inverseJoinColumns = @JoinColumn(name="cliente_id")
    )

    private List<BoletaCompra> boletaCompra;
    
    public Productos() {
    }


    public Productos(int id, String nombreProducto, int precioProducto, int stock) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stock = stock;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public int getPrecioProducto() {
        return precioProducto;
    }


    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }


    public int getStock() {
        return stock;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
