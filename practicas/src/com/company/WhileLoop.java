package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        boolean check = true;
        int count = 0;

        while (count < 10){
            count++;
            if (count == 6)
                continue; // saltea cuando lo indicamos
            System.out.println("hola mundo "+ count);
        }
        System.out.println("fin");
        System.out.println(" ");
        int count1 = 0;
        while (count1 < 10){
            count1++;
            if (count1 == 6)
                break; // rompe el flujo de ejecucion
            System.out.println("hola mundo "+ count1);
        }
        System.out.println("fin");
    }
}
