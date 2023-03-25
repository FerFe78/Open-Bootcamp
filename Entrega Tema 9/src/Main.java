public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre="Juan";
        cliente.edad = 35;
        cliente.telefono = "+54-11-1234-5678";
        cliente.credito = 10950.99;

        System.out.println(cliente.nombre +" "+ cliente.edad +" "+ cliente.telefono +" "+ cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "José";
        trabajador.edad = 42;
        trabajador.telefono = "+52-23-1324-5678";
        trabajador.salario = 4538.50;

        System.out.println(trabajador.nombre +" "+ trabajador.edad +" "+ trabajador.telefono +" "+ trabajador.salario);

    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}