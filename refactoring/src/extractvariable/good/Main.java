package extractvariable.good;

import extractvariable.bad.Order;

public class Main {


    void printproductPrice(Order order){

        //1. precio total de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        //2. descuento
        Double offerPrice = order.getPrice() - order.getOffer();

        // 3. precio final = precio total menos descuento
        Double finalPrice = quantityPrice - offerPrice;

        //4. calculo del precio del envio
        Double shippingPrice = order.getShipping() * 2;

        // TODO - nuevo calculo

        //5. precio final
        System.out.println(finalPrice + shippingPrice);
    }
}
