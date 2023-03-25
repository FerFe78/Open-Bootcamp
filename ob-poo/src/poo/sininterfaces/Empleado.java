package poo.sininterfaces;

public class Empleado {

    private String nombre;
    private String apellido;
    private int edad;
    private int sueldo;
    boolean alta;

    // 2. constructor

    public Empleado() {}

    public Empleado(String nombre, String apellido, int edad,int sueldo, boolean alta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.alta = alta;
        this.sueldo = sueldo;
    }

    // 3. metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                ", alta=" + alta +
                '}';
    }
}
