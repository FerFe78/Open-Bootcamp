package com.example.estructurasdecontrol.repetitivas;

public class While {

    public static void main(String[] args) {


        int i = 0;

        while (i < 10) {
            i++;
            System.out.println("contador: " + i);

            if (i == 5) {
                //break; corta la ejecución del bucle.
                continue;//saltea el valor de la condicion.
            }
            System.out.println("contador: " + i);
        }
    }
}
