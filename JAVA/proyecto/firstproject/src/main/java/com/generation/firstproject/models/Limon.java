package com.generation.firstproject.models;

public class Limon extends Frutas{

    String vitaminas; 

    public Limon() {
        super();
    }

    public Limon(String sabor, Integer semillas, String colores, Float peso, String cascara, String tamanio) {
        super(sabor, semillas, colores, peso, cascara, tamanio);
        this.vitaminas = vitaminas;
    }

    @Override
    public String toString() {
        return super.toString() + "Limon [vitaminas=" + vitaminas + "]";
    }
 

}
