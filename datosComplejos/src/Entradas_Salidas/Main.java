package Entradas_Salidas;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa dos números: ");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Números invalidos");
            }
        } while (!ok);

        try {
            // Crea un archivo con el contenido info (en este caso hola)
            PrintStream info = new PrintStream("copia.txt");
            info.println("hola: ");

            InputStream in = new FileInputStream("/etc/passwd.txt"); //copiar un archivo en otro
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
        } catch (IOException e) {
            System.out.println("Excepcion : " + e.getMessage());
        }

            /*InputStream fichero = new FileInputStream("/etc/passwd"); // para leer ficheros
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero); // para leer ficheros autorregulado
            try {
                int dato = ficheroBuffer.read();// para tipo de lectura buffered
                while (dato >= 0) {
                    System.out.println((char)dato);
                    dato = ficheroBuffer.read();
                }
                /*byte[] datos = fichero.readAllBytes(); //lee todo el fichero de una vez
                for (byte dato : datos) {
                    System.out.println((char)dato);
                }
                 byte[] datos = new byte[5]; //para leer de 5 en 5
                int dato = fichero.read(datos);
                while (dato != -1){ // EOF - end of file
                    System.out.print(datos.toString());
                    dato = fichero.read(datos);
                int dato = fichero.read(); // para leer byte a byte
                while (dato != -1){ // EOF - end of file
                    System.out.print((char)dato);
                    dato = fichero.read();
                 */

        //}catch (IOException e){
        //  System.out.println("no puedo leer el fichero: " + e.getMessage());
        //}
    }
}
