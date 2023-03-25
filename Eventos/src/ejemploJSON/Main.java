package ejemploJSON;

import org.json.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            // Creamos el inputstream desde un fichero
            InputStream is = new FileInputStream("datos.json");
            // Creamos un tokenizador que leera desde nuestro IS
            JSONTokener tokener = new JSONTokener(is);
            // Y se lo pasamos a una instancia de la clse JSONObject
            JSONObject obj = new JSONTokener(tokener);
            // Sacsamos las credenciales:
            JSONObject credenciales = obj.getJSONObject("credenciales");
            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");
            System.out.println("Usuario: " + usuario + "clave: " + clave);
            // Dentro de credenciales tenemos los videos:
            JSONArray videos = credenciales.JSONArray(videos);
            for (Object video: videos) {
                System.out.println(video.toString());
            }
        }catch (Exception e) {
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }
    }
}
