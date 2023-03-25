package com.example.estructurasdecontrol.condicionales;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrece la edad");
        double edad = scanner.nextDouble();

        boolean esMenor = edad < 18;

        if(esMenor) {
            System.out.println("Es menor de edad");
        }
        if(!esMenor){
            System.out.println("Es mayor de edad");
        }
    }
}
