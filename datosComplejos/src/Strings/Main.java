package Strings;


public class Main {
    public static void main(String[] args) {
        String  cadena = "Mensaje de texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de mi cadena es de: " + cadenaLen);

        String cadenaMinuscula = cadena.toLowerCase();
        System.out.println("La cadena ahora es " + cadenaMinuscula);

        String cadenaMayuscula = cadena.toUpperCase();
        System.out.println("La cadena mayuscula " + cadenaMayuscula);

        boolean resultado = cadena.startsWith("Mens");
        if (resultado){
            System.out.println("Empieza por lo que estoy buscando");

        }else{
            System.out.println("Empieza con otra cosa");
        }

        char letra = cadena.charAt(4);
        System.out.println("El caracter de mi cadena es: " + letra);

        for (int i = 0; i <cadenaLen; i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }
        //System.out.println("");
        for (int i = cadenaLen-1; i >= 0; i--) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }
    }
}