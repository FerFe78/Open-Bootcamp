package Ejercicios;

import java.io.*;
import java.util.*;

public class Ejercicios7al9 {
    public static class Ejercicio1 {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese una frase para invertir");
            String frase = read.nextLine();

            StringBuilder reves = new StringBuilder(frase);
            frase = reves.reverse().toString();

            System.out.println(frase);
        }
    }
    public static class Ejercicio2 {
        public static void main(String[] args) {
            String[] miArray = {"Hola", "Mundo", "en", "Java"};

            // Recorremos el array con un bucle for
            for (String s : miArray) {
                System.out.println(s);
            }
        }
    }
    public static class Ejercicio3 {
        public static void main(String[] args) {
            int[][] miArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

            // Recorremos el array con dos bucles for
            for(int i = 0; i < miArray.length; i++) {
                for(int j = 0; j < miArray[i].length; j++) {
                    System.out.println("Valor en [" + i + "][" + j + "]: " + miArray[i][j]);
                }
            }
        }

    }
    public static class Ejercicio4 {
    /* El problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000
        elementos para ser añadidos al mismo es que podría haber un alto consumo de memoria.
        Cuando creamos un Vector sin especificar su capacidad inicial, Java utiliza una capacidad
        por defecto que es de 10 elementos. Esto significa que el Vector se crea con capacidad
        para 10 elementos, y cuando se añaden más elementos de los que caben en la capacidad actual,
        Java automáticamente aumenta la capacidad del Vector para poder acomodar los nuevos elementos.
        Este proceso de aumentar la capacidad del Vector implica crear un nuevo arreglo interno con
        la capacidad requerida, copiar todos los elementos existentes en el nuevo arreglo, y luego
        agregar los nuevos elementos. Este proceso puede ser ineficiente y llevar a un consumo
        innecesario de memoria, especialmente si estamos añadiendo un gran número de elementos.
        En el caso de tener 1000 elementos para ser añadidos, si usamos un Vector con capacidad
        por defecto, Java aumentaría la capacidad del Vector varias veces a medida que se van añadiendo
        los elementos, lo que puede llevar a un alto consumo de memoria y afectar el rendimiento de la
        aplicación.
        Para evitar este problema, es recomendable utilizar el constructor del Vector que permite
        especificar la capacidad inicial, de manera que se pueda crear un Vector con la capacidad
        suficiente para acomodar todos los elementos que se van a añadir.
     */
    }
    public static class Ejercicio5 {

        public static void main(String[] args) {
            // Creamos el ArrayList con 4 elementos
            ArrayList<String> miArrayList = new ArrayList<>();
            miArrayList.add("elemento1");
            miArrayList.add("elemento2");
            miArrayList.add("elemento3");
            miArrayList.add("elemento4");

            // Copiamos el ArrayList en una LinkedList
            LinkedList<String> miLinkedList = new LinkedList<>(miArrayList);

            // Recorremos el ArrayList y mostramos los valores
            System.out.println("Valores en el ArrayList:");
            for(String elemento : miArrayList) {
                System.out.println(elemento);
            }

            // Recorremos la LinkedList y mostramos los valores
            System.out.println("Valores en la LinkedList:");
            for(String elemento : miLinkedList) {
                System.out.println(elemento);
            }
        }

    }
    public static class Ejercicio6 {

        public static void main(String[] args) {
            // Creamos el ArrayList de tipo int
            ArrayList<Integer> miArrayList = new ArrayList<>();

            // Rellenamos el ArrayList con elementos del 1 al 10
            for(int i=1; i<=10; i++) {
                miArrayList.add(i);
            }

            // Recorremos el ArrayList y eliminamos los números pares
            for(int i=0; i<miArrayList.size(); i++) {
                if(miArrayList.get(i) % 2 == 0) {
                    miArrayList.remove(i);
                    i--; // Para ajustar el índice después de la eliminación
                }
            }

            // Recorremos el ArrayList final y mostramos sus valores
            System.out.println("Valores en el ArrayList final:");
            for(int elemento : miArrayList) {
                System.out.println(elemento);
            }
        }
    }
    public static class Ejercicio7 {

        public static void main(String[] args) {
            try {
                DividePorCero();
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse");
            } finally {
                System.out.println("Demo de código");
            }
        }

        public static int DividePorCero() throws ArithmeticException {
            int a = 10;
            int b = 0;
            return a / b;
        }
    }
    public static class Ejercicio8 {

        public static void main(String[] args) throws IOException {

            copiarArchivo("C:\\Users\\lopez\\Documents\\archivo_entrada.txt", "archivo_salida.txt");
            System.out.println("El archivo se ha copiado correctamente.");

        }
        public static void copiarArchivo(String fileIn, String fileOut) throws IOException {
            InputStream fis = new FileInputStream(fileIn);
            PrintStream ps = new PrintStream(fileOut);

            byte[] buffer = fis.readAllBytes() ;
            fis.close();
            ps.write(buffer);
            ps.close();
        }
    }
    public static class Ejercicio9 {
        public static void main(String[] args) throws IOException {

            HashMap<String, Integer> DiscosEstudioTheRollingStones = new HashMap<>();
            //Agregamos las Keys y los values a nuestro Hashmap

            DiscosEstudioTheRollingStones.put("The Rolling Stones",1964);
            DiscosEstudioTheRollingStones.put("12 x 5",1964);
            DiscosEstudioTheRollingStones.put("The Rolling Stones No.2",1965);
            DiscosEstudioTheRollingStones.put("The Rolling Stones Now",1965);
            DiscosEstudioTheRollingStones.put("Out of Our Heads",1965);
            DiscosEstudioTheRollingStones.put("December's Children (And Everybody's)",1965);
            DiscosEstudioTheRollingStones.put("Aftermath",1966);
            DiscosEstudioTheRollingStones.put("Between the Buttons",1967);
            DiscosEstudioTheRollingStones.put("Their Satanic Majesties Request",1967);
            DiscosEstudioTheRollingStones.put("Let it Bleed",1969);
            DiscosEstudioTheRollingStones.put("Exile on Main St.",1972);
            DiscosEstudioTheRollingStones.put("Goats Head Soup",1973);
            DiscosEstudioTheRollingStones.put("It's Only Rock 'n Roll",1974);
            DiscosEstudioTheRollingStones.put("Black and Blue",1976);
            DiscosEstudioTheRollingStones.put("Some Girls",1978);
            DiscosEstudioTheRollingStones.put("Emotional Rescue",1980);
            DiscosEstudioTheRollingStones.put("Tatoo You",1981);
            DiscosEstudioTheRollingStones.put("Undercover",1983);
            DiscosEstudioTheRollingStones.put("Dirty Work",1986);
            DiscosEstudioTheRollingStones.put("Steel Wheels",1989);
            DiscosEstudioTheRollingStones.put("Voodoo Lounge",1994);
            DiscosEstudioTheRollingStones.put("Bridges to Babylon",1997);
            DiscosEstudioTheRollingStones.put("A Bigger Bang",2005);
            DiscosEstudioTheRollingStones.put("Blue & Lonesome",2016);

            // Leemos Hashmap
            try {
                for (Map.Entry<String, Integer> element : DiscosEstudioTheRollingStones.entrySet()) {
                    System.out.println("Disco: " + element.getKey() + " - Año: " + element.getValue());
                }
                //Creamos un ArrayList
                ArrayList<String> discos = new ArrayList<>();

                for (Map.Entry<String, Integer> element : DiscosEstudioTheRollingStones.entrySet()){
                    discos.add(element.getKey());
                }
                //Imprimimos el ArrayList
                for(String element : discos) {
                    System.out.println("Discos de estudio The Rolling Stones: " + element);
                }
                //Creamos un fichero y agregamos la informacion del Hashmap

                PrintStream fileOut = new PrintStream("DiscosEstudioTheRollingStones.txt");
                fileOut.println(DiscosEstudioTheRollingStones);
                fileOut.close();

                //Convertimos la info del fichero en datos que podamos copiar
                InputStream fileIn = new FileInputStream("DiscosEstudioTheRollingStones.txt");
                byte[] datos = fileIn.readAllBytes();
                fileIn.close();

                //copiamos la informacion en un nuevo fichero
                PrintStream fileOut2 = new PrintStream("DiscosEstudioTheRollingStonesCopy.txt");
                fileOut2.write(datos);
                fileOut2.close();
            }catch (IOException e){
                System.out.println("La excepcion es: "+ e.getClass());
            }
        }
    }




}
