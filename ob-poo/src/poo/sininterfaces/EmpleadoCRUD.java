package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * C-Create
 * R-Retrieve/Read
 * U-Update
 * D-Delete
 */

public class EmpleadoCRUD {

    // Estructura de datos
    List<Empleado> empleados = new ArrayList<>();


    // Create - guardar un empleado
    public void save(Empleado empleado){

        empleados.add(empleado);
    }
    // Read - consultar empleados
    public List<Empleado> findAll(){
        return empleados;
    }
}
