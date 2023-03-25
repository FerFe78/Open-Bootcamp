package com.example.interfaces;

import com.example.Coche;
import com.example.CocheHibrido;
import com.example.interfaces.CocheService;

public class CocheServiceSportImplement implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche");
    }
}
