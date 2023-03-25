package com.example.interfaces;

import com.example.Coche;
import com.example.CocheElectrico;
import com.example.interfaces.CocheService;

public class CocheServiceClassicImplement implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruir coche");
    }
}
