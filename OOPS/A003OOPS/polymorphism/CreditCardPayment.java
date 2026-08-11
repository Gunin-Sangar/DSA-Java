package OOPS.A003OOPS.polymorphism;

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
