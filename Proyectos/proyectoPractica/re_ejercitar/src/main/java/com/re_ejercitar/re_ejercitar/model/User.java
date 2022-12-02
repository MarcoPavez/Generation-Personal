package com.re_ejercitar.re_ejercitar.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="User")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String nombre;
    private String apellido_mat;
    private String apellido_pat;
    @Column(name="email",unique=true)
    private String correo;
    @Range(min=0)
    private int edad;
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name="BoletaCompra",
        joinColumns = @JoinColumn(name="cliente_id"),
        inverseJoinColumns = @JoinColumn(name="producto_id")
    )

    private List<BoletaCompra> boletaCompra;

    
    public User() {
    }

    public User(int id, String nombre, String apellido_mat, String apellido_pat, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_mat = apellido_mat;
        this.apellido_pat = apellido_pat;
        this.correo = correo;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
