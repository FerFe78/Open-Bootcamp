package com.example;

public class SmartWatch extends SmartDevice {

    String colorMalla;
    boolean mallaIntercambiable;
    boolean resisteAgua;


    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, String material, double peso, String tecPantalla, double tamPantalla, String sistOp, String tipoCarga, int durBateria, int capacidadBateria, int memoriaInterna, int memoriaRam, String procesador, int cantNucleosProcesador, double velProcesador, boolean wifi, boolean bluetooth, boolean gps, boolean pantallaTactil, boolean nfc, String colorMalla, boolean mallaIntercambiable, boolean resisteAgua) {
        super(marca, modelo, color, material, peso, tecPantalla, tamPantalla, sistOp, tipoCarga, durBateria, capacidadBateria, memoriaInterna, memoriaRam, procesador, cantNucleosProcesador, velProcesador, wifi, bluetooth, gps, pantallaTactil, nfc);
        this.colorMalla = colorMalla;
        this.mallaIntercambiable = mallaIntercambiable;
        this.resisteAgua = resisteAgua;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "resisteAgua=" + resisteAgua +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", peso=" + peso +
                ", tecPantalla='" + tecPantalla + '\'' +
                ", tamPantalla=" + tamPantalla +
                ", sistOp='" + sistOp + '\'' +
                ", tipoCarga='" + tipoCarga + '\'' +
                ", durBateria=" + durBateria +
                ", capacidadBateria=" + capacidadBateria +
                ", memoriaInterna=" + memoriaInterna +
                ", memoriaRam=" + memoriaRam +
                ", procesador='" + procesador + '\'' +
                ", cantNucleosProcesador=" + cantNucleosProcesador +
                ", velProcesador=" + velProcesador +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", gps=" + gps +
                ", pantallaTactil=" + pantallaTactil +
                ", nfc=" + nfc +
                "colorMalla='" + colorMalla + '\'' +
                ", mallaIntercambiable=" + mallaIntercambiable +
                ", resisteAgua=" + resisteAgua +
                '}';
    }
}
