package com.generation.firstproject.models;

public class Mandarina extends Frutas{


    String aromatiza;

    public Mandarina() {
        super();
    }

    public Mandarina(String sabor, Integer semillas, String colores, Float peso, String cascara, String tamanio, String aromatiza) {
        super(sabor, semillas, colores, peso, cascara, tamanio);
        this.aromatiza = aromatiza;
    }

    @Override
    public String toString() {
        return super.toString() + "Mandarina [aromatiza=" + aromatiza + "]";
    }

    
}

    
