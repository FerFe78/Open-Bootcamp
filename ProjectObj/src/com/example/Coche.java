package com.example;

public abstract class Coche {

    // Utilizaria abstracta en el caso de querer definir un objeto pero no puedo crearlo a partir de esa clase
    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double large;
    Integer velocidad = 0;

    // constructores
    public Coche(String color, String fabricante, String modelo, Double peso,Double large){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.large = large;
    }

    public Coche() {
    }

    // comportamiento
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "com.example.Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", velocidad=" + velocidad +
                '}';
    }
}
