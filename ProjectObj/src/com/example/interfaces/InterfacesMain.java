package com.example.interfaces;

import com.example.Coche;
public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImplement();
        CocheService service1 = new CocheServiceSportImplement();


        Coche coche = service.crearCocheDemo();
        Coche coche1 = service1.crearCocheDemo();

        

    }
}
