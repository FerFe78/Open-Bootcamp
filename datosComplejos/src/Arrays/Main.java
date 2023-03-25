package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + " " + array1[i]);
        }
        //System.out.println("");
        for (int i : array1) {
            System.out.println(i);
        }
        int[] array2 = {1, 2, 3, 4, 5};
        //System.out.println("");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(i + " " + array2[i]);
        }
        //System.out.println("");
        for (int i : array2) {
            System.out.println(i);
        }
        String[] nombres = {
                "Pepe",
                "Juan",
                "Pedro",
                "Maria",
                "Ana"
        };
        //System.out.println("");

        //accedo al valor desde la posicion
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(i + " " + nombres[i]);
        }
        //System.out.println("");
        // foreach accedo directamente al valor
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("Longitud del array " + nombres.length);
        //System.out.println("");
        String ultimoNombre = "";
        for (String nombre : nombres) {
            ultimoNombre = nombre;
        }
        System.out.println(ultimoNombre);

        int[][] arrayBidi = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 5;
        arrayBidi[1][1] = 6;
        arrayBidi[1][2] = 7;
        arrayBidi[1][3] = 8;
        //System.out.println("");
        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("i = " + i + " j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }
        //array Bidimensional: 2 filas x 4 columnas
        int[][] arrayBidi2 = {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };
        //System.out.println("");
        for (int i = 0; i < arrayBidi2.length; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 0; j < arrayBidi2[i].length; j++) {
                System.out.println("i = " + i + " j = " + j);
                System.out.println(arrayBidi2[i][j]);
            }
        }


        //int arrayTridi[][][] = new int[][][];
    }
}
