package OOPS.A003OOPS.polymorphism;

// run-time polymorphism
// Example: Method Overriding
public class Main {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(1500);

        payment = new UpiPayment();
        payment.pay(800);

        payment = new CashPayment();
        payment.pay(500);
    }
}