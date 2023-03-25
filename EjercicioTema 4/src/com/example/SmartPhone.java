package com.example;

public class SmartPhone extends SmartDevice {

    int resolucionCamaraPrincipalMp;
    int resolucionCamaraDelanteraMp;
    boolean flashCamaraDelantera;
    int fercuenciaActPantallaHz;
    boolean batRemovible;
    boolean cargaInalambrica;
    boolean cargaRapida;
    boolean lectorHuellaDig;
    boolean reconocimientoFacial;
    boolean reconocimientoIris;
    boolean conectorJackAudio;
    boolean tarjetaMemoria;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, String material, double peso, String tecPantalla, double tamPantalla, String sistOp, String tipoCarga, int durBateria, int capacidadBateria, int memoriaInterna, int memoriaRam, String procesador, int cantNucleosProcesador, double velProcesador, boolean wifi, boolean bluetooth, boolean gps, boolean pantallaTactil, boolean nfc, int resolucionCamaraPrincipalMp, int resolucionCamaraDelanteraMp, boolean flashCamaraDelantera, int fercuenciaActPantallaHz, boolean batRemovible, boolean cargaInalambrica, boolean cargaRapida, boolean lectorHuellaDig, boolean reconocimientoFacial, boolean reconocimientoIris, boolean conectorJackAudio, boolean tarjetaMemoria) {
        super(marca, modelo, color, material, peso, tecPantalla, tamPantalla, sistOp, tipoCarga, durBateria, capacidadBateria, memoriaInterna, memoriaRam, procesador, cantNucleosProcesador, velProcesador, wifi, bluetooth, gps, pantallaTactil, nfc);
        this.resolucionCamaraPrincipalMp = resolucionCamaraPrincipalMp;
        this.resolucionCamaraDelanteraMp = resolucionCamaraDelanteraMp;
        this.flashCamaraDelantera = flashCamaraDelantera;
        this.fercuenciaActPantallaHz = fercuenciaActPantallaHz;
        this.batRemovible = batRemovible;
        this.cargaInalambrica = cargaInalambrica;
        this.cargaRapida = cargaRapida;
        this.lectorHuellaDig = lectorHuellaDig;
        this.reconocimientoFacial = reconocimientoFacial;
        this.reconocimientoIris = reconocimientoIris;
        this.conectorJackAudio = conectorJackAudio;
        this.tarjetaMemoria = tarjetaMemoria;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
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
                "resolucionCamaraPrincipalMp=" + resolucionCamaraPrincipalMp +
                ", resolucionCamaraDelanteraMp=" + resolucionCamaraDelanteraMp +
                ", flashCamaraDelantera=" + flashCamaraDelantera +
                ", fercuenciaActPantallaHz=" + fercuenciaActPantallaHz +
                ", batRemovible=" + batRemovible +
                ", cargaInalambrica=" + cargaInalambrica +
                ", cargaRapida=" + cargaRapida +
                ", lectorHuellaDig=" + lectorHuellaDig +
                ", reconocimientoFacial=" + reconocimientoFacial +
                ", reconocimientoIris=" + reconocimientoIris +
                ", conectorJackAudio=" + conectorJackAudio +
                ", tarjetaMemoria=" + tarjetaMemoria +
                '}';
    }

}

