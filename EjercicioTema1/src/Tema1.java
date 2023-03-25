public class Tema1 {
    public static void main(String[] args) {

        // enteros
        byte number1 = 1; // 1 byte
        System.out.println("number1 es una variable de tipo " + ((Object)number1).getClass().getSimpleName() + " y su valor es " + number1);
        short number2 = 2; // 2 byte
        System.out.println("number2 es una variable de tipo " + ((Object)number2).getClass().getSimpleName() + " y su valor es " + number2);
        int number3 = 3; // 4 byte
        System.out.println("number3 es una variable de tipo " + ((Object)number3).getClass().getSimpleName() + " y su valor es " + number3);
        long number4 = 4L; // 8 byte
        System.out.println("number4 es una variable de tipo " + ((Object)number4).getClass().getSimpleName() + " y su valor es " + number4);


        // punto flotante
        float decimal1 = 4.9f;
        System.out.println("decimal1 es una variable de tipo " + ((Object)decimal1).getClass().getSimpleName() + " y su valor es " + decimal1);
        double decimal2 = 4.99d;
        System.out.println("decimal2 es una variable de tipo " + ((Object)decimal2).getClass().getSimpleName() + " y su valor es " + decimal2);


        // booleanos
        boolean verdadero = true;
        System.out.println("verdadero es una variable de tipo " + ((Object)verdadero).getClass().getSimpleName() + " y su valor es " + verdadero);
        boolean falso = false;
        System.out.println("falso es una variable de tipo " + ((Object)falso).getClass().getSimpleName() + " y su valor es " + falso);

        // cadenas de texto
        String nombre = "Fernando";
        System.out.println("nombre es una variable de tipo " + ((Object)nombre).getClass().getSimpleName() + " y su valor es " + nombre);

        // tipos envoltorio
        Integer numero1 = null;
        Long numero2 = 2L;


    }
}