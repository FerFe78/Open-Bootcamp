package BigDecimal;

import java.math.BigDecimal;
public class Main {
// BigDecimal - Se utiliza en el sector financiero debido a su precision
    public static void main(String[] args) {

        System.out.println(0.1f +0.1f +0.1f +0.1f +0.1f +0.1f +0.1f +0.1f +0.1f + 0.1f );

        BigDecimal valorA = new BigDecimal("3.14");
        System.out.println(valorA);
        BigDecimal valorB = new BigDecimal("3.15");

        //suma el bigdecimal "valorB" al "valorA"
        BigDecimal suma = valorA.add(valorB);
        System.out.println(suma);

        //resta el bigdecimal "valorB" al "valorA"
        BigDecimal resta = valorA.subtract(valorB);
        System.out.println(resta);

        //multiplicacion del bigdecimal "valorB" al "valorA"
        BigDecimal multiplicacion = valorA.multiply(valorB);
        System.out.println(multiplicacion);

        //division del bigdecimal "valorB" al "valorA"
        //BigDecimal division = valorA.divide(valorB)
        //System.out.println(division.toString())
    }

}
