package egg.introjava.ejercicios.dia1y2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner read3 = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = read3.nextLine();
        String fraseMay = frase.toUpperCase();
        System.out.println(fraseMay);
        String fraseMin = frase.toLowerCase();
        System.out.println(fraseMin);
    }
}
