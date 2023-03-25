package ArrayList;

import java.util.ArrayList;
//import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //capacidadVector = capacidadVector * 2 ; la capacidad se duplica.
        //
        //capacidadArrayList = capacidadArrayList * 1.5 : la capacidad aumenta en un 50%
        ArrayList<String> lista = new ArrayList<>();
        lista.add("elementoA");
        lista.add("elementoB");
        lista.add("elementoC");
        lista.add("elementoD");
        lista.add("elementoE");

        System.out.println("contenido: " + lista);

        lista.remove(4);
        System.out.println("contenido: " + lista);

        for (String s : lista) {
            System.out.println(s);
        }
        System.out.println();
        String[] lista1 = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++){
            lista1[i] = lista.get(i);
            System.out.println(lista1[i]);
        }
        System.out.println();
        for (Object arrayObjeto : lista1){
            System.out.println(arrayObjeto.toString());
        }
        //LinkedList<String> listaEnlazada = new LinkedList<>();
        // es igual a la arrayList pero es mas rapida de modificar



    }
}
