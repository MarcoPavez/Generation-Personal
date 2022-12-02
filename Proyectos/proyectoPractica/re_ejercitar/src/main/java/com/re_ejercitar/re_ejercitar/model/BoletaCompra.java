package com.re_ejercitar.re_ejercitar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="BoletaCompra")
public class BoletaCompra {
    @Id
    @GeneratedValue
    private int id;
    @Range(min=0)
    private int precioCompra;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fecha;
    

    //Relaciones entre tablas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="producto_id")
    private Productos productos;

    //Constructores, getters y setters
    public BoletaCompra() {
    }


    public BoletaCompra(int id, int precioCompra, Date fecha) {
        this.id = id;
        this.precioCompra = precioCompra;
        this.fecha = fecha;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getPrecioCompra() {
        return precioCompra;
    }


    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }


    public Date getFecha() {
        return fecha;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
