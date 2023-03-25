package poo.sininterfaces;

import java.util.List;
public class Main {
    public static void main(String[] args) {


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado Juanito = new Empleado("Juan","Perez",40000,35,true);
        Empleado Patricia = new Empleado("Patricia","Lopez",30,35000,true);
        Empleado Maria = new Empleado("Maria","Gonzalez",28,45000,true);

        // Guardar empleado

        empleadoCRUD.save(Juanito);
        empleadoCRUD.save(Patricia);
        empleadoCRUD.save(Maria);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
        



    }
}
