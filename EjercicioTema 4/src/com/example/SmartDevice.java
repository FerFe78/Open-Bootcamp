package com.example;

public abstract class SmartDevice {

    String marca;
    String modelo;
    String color;
    String material;
    double peso;
    String tecPantalla;
    double tamPantalla;
    String sistOp;
    String tipoCarga;
    int durBateria;
    int capacidadBateria;
    int memoriaInterna;
    int memoriaRam;
    String procesador;
    int cantNucleosProcesador;
    double velProcesador;
    boolean wifi;
    boolean bluetooth;
    boolean gps;
    boolean pantallaTactil;
    boolean nfc;


    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color, String material, double peso, String tecPantalla, double tamPantalla, String sistOp, String tipoCarga, int durBateria, int capacidadBateria, int memoriaInterna, int memoriaRam, String procesador, int cantNucleosProcesador, double velProcesador, boolean wifi, boolean bluetooth, boolean gps, boolean pantallaTactil, boolean nfc) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.material = material;
        this.peso = peso;
        this.tecPantalla = tecPantalla;
        this.tamPantalla = tamPantalla;
        this.sistOp = sistOp;
        this.tipoCarga = tipoCarga;
        this.durBateria = durBateria;
        this.capacidadBateria = capacidadBateria;
        this.memoriaInterna = memoriaInterna;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.cantNucleosProcesador = cantNucleosProcesador;
        this.velProcesador = velProcesador;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.pantallaTactil = pantallaTactil;
        this.nfc = nfc;
    }
}
