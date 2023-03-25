package com.example.estructurasdecontrol.repetitivas;

public class ForEach {
    public static void main(String[] args) {

        String[] nombres = {"Pepe", "Juan", "Pedro", "Roberto"};

        for(String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("");
        for(String nombre : nombres) {
            System.out.print(nombre + " ");
        }
        System.out.println("");

        int[] numeros = {5, 6, 7, 8, 9, 10, 11};
        int suma = 0;
        for(int numero : numeros) {
            suma += numero;//suma = suma + numero
        }
        System.out.println(suma);
    }
}
