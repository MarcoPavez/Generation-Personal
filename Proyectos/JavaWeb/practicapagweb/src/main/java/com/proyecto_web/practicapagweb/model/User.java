package com.proyecto_web.practicapagweb.model;

public class User {
    private int id;
    private String name;
    private String apellido;
        
    public User() {
    }

    public User(int id, String name, String apellido) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    
}
