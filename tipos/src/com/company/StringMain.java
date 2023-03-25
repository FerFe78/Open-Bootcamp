package com.company;

public class StringMain {
    public static void main(String[] args) {


        //la Clase String

        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            trim()
            equals()
            comparaTo
         */

        String mensaje = "  Hola mundo  ";

        System.out.println(mensaje.length());
        System.out.println(mensaje);
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());

        String otro = "HOLA MUNDO";


        if (mensajeMay.equals(otro)){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }

        String mensajeMaytrim = mensajeMay.trim();

        if (mensajeMaytrim.equals(otro)){
            System.out.println("verdadero");
        }else{
            System.out.println("falso");
        }

        if (mensajeMay.equalsIgnoreCase(mensaje)){
            System.out.println("verdadero");
        }else {
            System.out.println("falso");
        }
    }
}
