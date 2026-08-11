package OOPS.A003OOPS.polymorphism;

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}
