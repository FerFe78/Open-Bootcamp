package com.company;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("cierre de recursos"); // finaly se ejecuta si o si!
        }
        System.out.println("fin");
    }
}
