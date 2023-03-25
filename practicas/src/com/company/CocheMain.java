package com.company;

public class CocheMain {
    public static void main(String[] args) {

            String coche = "alfa romeo";
            Coche cocheObj = new Coche("azul", "ford", "mustang", 1673.38, 4.9);

            Coche cocheObj2 = new Coche("rojo","honda", "civic", 1459.60, 5.4 );

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

            cocheElectrico.acelerar(70);

            System.out.println(cocheElectrico);
    }
}
