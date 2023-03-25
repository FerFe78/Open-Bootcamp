package Vectores;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(2, 2);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println("Datos del vector: " + vector);
        System.out.println("Vector tamaño: " + vector.size() + " capacidad: " + vector.capacity());


        vector.remove(2);
        System.out.println("Datos del vector: " + vector);
        System.out.println("Vector tamaño: " + vector.size() + " capacidad: " + vector.capacity());

        Vector<Integer> vector1 = new Vector(20);
        vector1.add(1);
        vector1.add(2);
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);

        boolean resultado = vector.equals(vector1);
        System.out.println("Son iguales? " + resultado);

        vector1.remove(2);
        boolean resultado1 = vector.equals(vector1);
        System.out.println("Son iguales? " + resultado1);

        for (int i = 0; i< vector1.size(); i++) {
            System.out.println("valor es: " + vector1.get(i) + " en posicion: " + i);
        }
        System.out.println("");

        for (int i = 0; i< vector1.size(); i++){
            if(i%2==0){
                vector1.remove(i);
                continue;
            }
            System.out.println("valor es: " + vector1.get(i) + " en posicion: " + i);
        }

        Vector<Integer> vector2 = new Vector(16);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);

        System.out.println(vector2.get(4));
        vector2.remove(4);
        //System.out.println(vector2.get(4));//dara error ya que hemos removido esa ubicacion

        Vector<Integer> vector3 = new Vector(16);
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        vector3.add(4);
        vector3.add(5);

        System.out.println("La capacidad es: " + vector3.capacity() + " en posicion: " + vector3.size());
        vector3.trimToSize();
        System.out.println("La capacidad es: " + vector3.capacity() + " en posicion: " + vector3.size());


    }
}
