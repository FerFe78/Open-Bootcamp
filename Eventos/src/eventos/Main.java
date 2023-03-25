package eventos;
import java.util.ArrayList;

interface Mensajero {
    void hanSaludado();
}
class Receptor implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println("Hola en clase receptor "+ Math.random());
    }
}
class Emisor {
    private ArrayList<Mensajero> receptores = new ArrayList<Mensajero>();
    public void meteReceptor(Mensajero receptor) {receptores.add(receptor);}
    public void saluda(){
        for (Mensajero nl : receptores) {
            nl.hanSaludado();
        }
    }
}
class ReceptorMusical implements Mensajero {
    @Override
    public void hanSaludado() {
        System.out.println("Soy un receptor musical");
    }
}
public class Main{
    public static void main(String[] args){

        Emisor emisor = new Emisor();

        Receptor receptor = new Receptor();
        Receptor receptor1= new Receptor();
        Receptor receptor2= new Receptor();
        ReceptorMusical rm = new ReceptorMusical();

        emisor.meteReceptor(receptor);
        emisor.meteReceptor(receptor1);
        emisor.meteReceptor(receptor2);
        emisor.meteReceptor(rm);

        emisor.saluda();
    }
}
