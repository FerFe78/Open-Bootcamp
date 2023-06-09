package magicnumbers.good;

public class Main {

    private static final double PRECIO_MINIMO = 100;
    private static final double PRECIO_ENVIO = 4.99;
    private static final double ENVIO_GRATIS = 0;
    private static final double DESCUENTO = 0.1;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);

    }

    public static double calculateDiscount(double price) {
        return price * DESCUENTO;
    }

    public static double calculateShipping(double price) {
        return price < PRECIO_MINIMO ? PRECIO_ENVIO : ENVIO_GRATIS;
    }
}
