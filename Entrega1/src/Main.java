public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("es positivo");
        } else if (numeroIf < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println(numeroIf);
        }
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 0);

        int numeroFor = 0;

        for (;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        var estacion = "MARTES";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("La variable ingresada no es una estacion");
        }

    }
}