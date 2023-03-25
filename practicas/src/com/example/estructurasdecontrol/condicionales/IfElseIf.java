package com.example.estructurasdecontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "juernes";

        //ejemplo comparar
        boolean resultado = dia.equals("Martes");

        // if else if

        if(dia.equals("Lunes")){
            System.out.println("Fuerza que recien empieza");
        }else if (dia.equals("Martes")){
            System.out.println("Martes con M me vale");
        }else if (dia.equals("Miercoles")){
            System.out.println("Miercoles con M me viene");
        }else if (dia.equals("jueves")){
            System.out.println("Jueves esta noche se puede");
        }else if (dia.equals("Viernes")) {
            System.out.println("Viernes el cuerpo lo sabe y la mente tambien");
        }else if (dia.equals("Sabado")){
            System.out.println("Sabado el cuerpo lo sabe y la mente tambien");
        }else if (dia.equals("Domingo")){
            System.out.println("Domingo a recuperar que mañana vuelve a empezar");
        }else{
            System.out.println("Dia no encontrado");
        }

    }
}
