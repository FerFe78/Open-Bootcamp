package Mapas_ArrayAsociativo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();//clave: tipo String, valores: Integer

        map.put("clave1", 10);
        map.put("clave2", 20);
        map.put("clave3", 30);
        map.put("clave4", 40);

        System.out.println(map);
        System.out.println(map.get("clave3"));

        //redefino el valor de la calve
        map.put("clave4", 50);
        map.replace("clave3", 300);
        System.out.println(map);

        for (Map.Entry<String, Integer> element : map.entrySet()) {
            System.out.println("Element clave es: " + element.getKey());
            System.out.println("Element valor es: " + element.getValue());
        }
    }
}
