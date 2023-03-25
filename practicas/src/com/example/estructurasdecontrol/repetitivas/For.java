package com.example.estructurasdecontrol.repetitivas;

public class For {
    public static void main(String[] args) {


        String[] nombres = {"Pepe", "Juan", "Pedro", "Roberto"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println("");
        int[] numeros = {5, 6, 7, 8, 9, 10, 11};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];// suma = suma + numeros[i]
        }
        System.out.println(suma);
    }
}
