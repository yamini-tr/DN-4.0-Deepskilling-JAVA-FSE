package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(2000);

        cart.setPaymentStrategy(new UPIPayment());
        cart.checkout(500);
    }
}
