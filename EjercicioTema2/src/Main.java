public class Main {
    public static void main(String[] args) {

        double precioSinImp = 1000d;
        System.out.println("El precio sin IVA es de $ " + precioSinImp);
        //opcion 1
        precioFinal(precioSinImp);
        System.out.println("");
        //opcion 2
        System.out.println("El precio sin impuestos es de $ " + precioSinImp);
        System.out.println("El IVA es de $ " + calcularIva(precioSinImp));
        double total = precioFinal1(precioSinImp);
        System.out.println("El precio final es de $ " + total);
    }

    //opcion 1:  funcion con parámetros y sin tipo de retorno
    static void precioFinal(double precio) {
        double iva = precio * 0.21;// En Argentina es IVA es del 21%
        double precioFinal = precio + iva;

        System.out.println("El IVA (21%) es de $ " + iva);
        System.out.println("El total a pagar es de $ " + precioFinal);
    }

    //opcion 2: funcion con parámetros y con tipo de retorno
    static double precioFinal1(double precio) {
        return precio * 1.21;
    }
    static double calcularIva(double precio) {
        return precio * 0.21;
    }

}