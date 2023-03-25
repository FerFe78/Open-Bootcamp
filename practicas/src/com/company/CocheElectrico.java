package com.company;

public class CocheElectrico extends Coche {
    String motorElectrico;
    public CocheElectrico(){
    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double large, String motorElectrico) {
        super(color, fabricante, modelo, peso, large);
        this.motorElectrico = motorElectrico;
    }
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", large=" + large +
                ", velocidad=" + velocidad +
                '}';
    }
}
