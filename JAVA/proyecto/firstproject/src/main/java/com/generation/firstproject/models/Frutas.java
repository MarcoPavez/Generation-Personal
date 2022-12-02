package com.generation.firstproject.models;

public class Frutas {
    String sabor;
    Integer semillas;
    String colores;
    Float peso;
    String cascara;
    String tamanio;

    public Frutas() {

    }

    public Frutas(String sabor, Integer semillas, String colores, Float peso, String cascara, String tamanio) {
        this.sabor = sabor;
        this.semillas = semillas;
        this.colores = colores;
        this.peso = peso;
        this.cascara = cascara;
        this.tamanio = tamanio;
    }

    
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getSemillas() {
        return semillas;
    }

    public void setSemillas(Integer semillas) {
        this.semillas = semillas;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getCascara() {
        return cascara;
    }

    public void setCascara(String cascara) {
        this.cascara = cascara;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Frutas [sabor=" + sabor + ", semillas=" + semillas + ", colores=" + colores + ", peso=" + peso
                + ", cascara=" + cascara + ", tamanio=" + tamanio + "]";
    }
    
    
    






}







