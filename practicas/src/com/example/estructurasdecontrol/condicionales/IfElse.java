package com.example.estructurasdecontrol.condicionales;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrece la edad");
        int edad = scanner.nextInt();

        boolean esMenor = edad < 18;

        if (esMenor) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
}
