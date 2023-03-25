package com.example;

public class CocheMain {
    public static void main(String[] args) {
        String coche = "alfa romeo";
        Coche cocheObj = new CocheElectrico("azul", "ford", "mustang", 1673.38, 4.9, "motorElectrico");

        Coche cocheObj2 = new CocheHibrido();

        cocheObj.acelerar(80);
        cocheObj2.acelerar(50);

        System.out.println(cocheObj);
        System.out.println(cocheObj2);

        cocheObj.peso = 1589.50;
        System.out.println(cocheObj);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";
        cocheElectrico.peso = 1230.8;
        cocheElectrico.large = 4.5;

        System.out.println(cocheElectrico);

        cocheElectrico.acelerar(50);

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.color = "azul";
        cocheHibrido.fabricante = "toyota";
        cocheHibrido.modelo = "prius";
        cocheHibrido.peso = 1123.4;
        cocheHibrido.large = 4.2;

        System.out.println(cocheHibrido);

        cocheHibrido.acelerar(90);

        System.out.println(cocheHibrido);

        CocheElectrico cocheElectrico2 = new CocheElectrico("blanco","hyundai","bolt",1230d,5.1d,"XTZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(40);

        System.out.println(cocheElectrico2);
    }


}
