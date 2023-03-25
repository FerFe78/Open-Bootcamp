package egg.introjava.holamundo;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Scanner read = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = read.next();
        Scanner read1 = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad = Integer.parseInt(read1.next());
        System.out.println("Hola mundo soy "+ nombre +" tengo "+ edad+ " años y estoy programando en Java");


        byte b = 7; // entero 8 bits val min= -128, max=127
        short num1 = 1000;// entero 16 bits val min= -32,768 max= 32,767
        int num2 = 5861;// entero 32 bits val min= -2,147,483,648 max= 214748364
        long num3 = 186315658;// entero 64 bits val min= -9,223,372,036,854,775,808 max=9,223,372,036,854,775,807
        float dicimal1 = 5.94f;// decimal de precision simple de 32 bits (IEEE 754 punto flotante)
        double decimal2 = 32.85d;// decimal de precision simple de 64 bits (IEEE 754 punto flotante)
        char letra = 'a';// carácter simple unicode de 16 bits val min='\u0000'(en entero 0) max='\uffff' (en entero 65,535)
        String cadena = "Fernando";//Java provee también un soporte especial para cadena de caracteres a través de la clase String.
        boolean bool = true;// true or false

    }


}
