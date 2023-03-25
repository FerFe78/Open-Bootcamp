package poo.clases;

/**
 * Clase base o superclase o clase padre
 */

public class Vehiculo {

    // 1. atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected Motor motor;

    public Vehiculo(String fabricante, String mondeo, double v, int year, boolean b, Motor motorGTI){
        this.fabricante = fabricante;
        this.year = year;
    }

    double speed;


    // 2. constructores

    public Vehiculo(){

    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, double speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    // 3. metodos (comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    // getter y setter

    // toString


}
