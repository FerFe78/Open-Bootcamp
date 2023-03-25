package com.example.estructurasdecontrol.condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el día");
        String dia = scanner.next();

        dia = dia.toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("Hoy es Lunes");
                break;
            case "martes":
                System.out.println("Hoy es Martes");
                break;
            case "miercoles":
                System.out.println("Hoy es Miercoles");
                break;
            case "jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "viernes":
                System.out.println("Hoy es Viernes");
                break;
            case "sabado":
                System.out.println("Hoy es Sábado");
                break;
            case "domingo":
                System.out.println("Hoy es Domingo");
            default:
                System.out.println("Día no encontrado");
        }
    }
}
