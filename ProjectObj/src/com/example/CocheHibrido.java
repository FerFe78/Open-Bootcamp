package com.example;

public class CocheHibrido extends Coche{
    String motorHibrido;
    public CocheHibrido(){
    }
    public CocheHibrido(String motorHibrido){
        this.motorHibrido=motorHibrido;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", velocidad=" + velocidad +
                '}';
    }
}
