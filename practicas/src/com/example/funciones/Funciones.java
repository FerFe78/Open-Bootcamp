package com.example.funciones;

public class Funciones {

    public static void main(String[] args) {

        //opcion 1: funcion sin parametros y sin tipo de retorno
        showMenu();

        //opcion 2: funcion sin parámetros y con tipo de retorno

        String menu = getMenu();
        System.out.println(menu);
        
        double price = getPrice();
        System.out.println(price);
        
        //opcion 3: funcion con parámetros y sin tipo de retorno
        
        inmpimirSaludo ("OpenBootcamp");

        //opcion 4: funcion con parámetros y con tipo de retorno
        String nombre = "Fernando";
        String apellido = "Lopez Orts";
        String saludo = obtenerSaludo(nombre,apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(59, 43);
        System.out.println(resultadoSuma);
    }

    private static int suma(int num1, int num2) {
        return num1 + num2;
    }

    private static String obtenerSaludo(String name, String lastName) {
        return "Hola " + name + " " + lastName;
    }

    private static void inmpimirSaludo(String name) {

        System.out.println("buenas tardes " + name);
    }

    private static double getPrice() {

        return 54;
    }

    //la funcion empieza con void en el caso de que no quiera devolver nada.
    static void showMenu(){
        System.out.println("Bienvenidos al e-commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }
    //la funcion empieza con el tipo de dato a devolver si deseo que retorne algo.
    static String getMenu(){
        return "Bienvenidos al E-commerce de zapatillas \n1 - Ver zapatillas \n2 - Comprar zapatillas \n3 - Salir";
    }

}
