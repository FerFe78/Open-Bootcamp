package com.company;


import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("name1");
        nombres.add("name2");
        nombres.add("name3");
        nombres.add("name4");

        System.out.println(nombres);

        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add( new Coche("honda"));
        coches.add( new Coche("ford"));
        coches.add( new Coche("nissan"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }

        
    }
}
