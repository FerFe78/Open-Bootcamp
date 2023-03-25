package com.ejercicios;

import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el precio del item");
        double precio = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduzca el % de IVA correspondiente a su pais");
        double porcentajeIva = scanner1.nextDouble()/100;

        double iva = precio * porcentajeIva;
        double total = precio + iva;
        System.out.println("El importe total con pagar es de $ " + total);
    }
}