package at.mci.claudiasteiner.vorbereitung7_Strategy;

public class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}