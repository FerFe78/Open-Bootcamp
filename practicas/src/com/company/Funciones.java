package com.company;

public class Funciones {
    public static void main(String[] args) {

        holaMundo();

        holaMundo("Fer");

        String hola = devuelveHolaMundo();
        System.out.println(hola);

        /*
         Tipos funciones
         private : solo se puede llamar desde el main
         protected : se puede llamar desde el package
         public : se puede llamar desde todo el project

         */
        /**
         * @see : llamada datos
         */
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde funcion");
    }
    public static void holaMundo(String name) {
        System.out.println("Hola mundo soy " + name);
    }
    protected static String devuelveHolaMundo() {
        return "Hola mundo cruel";
    }

}