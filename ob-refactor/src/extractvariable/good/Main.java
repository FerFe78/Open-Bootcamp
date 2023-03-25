package extractvariable.good;

public class Main {

    void printProductPrice(Order order){
        Double quantityPrice = order.getPrice() * order.getQuantity();

        Double offerPrice = order.getPrice() * order.getOffer();

        Double finalPrice = quantityPrice - offerPrice;

        Double shippingCost = 0.0;
        if(finalPrice < 50){
            shippingCost = 2.99;
        }
        Double totalPrice = finalPrice + shippingCost;

        System.out.println(totalPrice);
    }
}
