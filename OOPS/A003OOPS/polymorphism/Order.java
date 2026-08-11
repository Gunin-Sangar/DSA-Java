package OOPS.A003OOPS.polymorphism;

// compile-time polymorphism
// Example: Method Overloading
class Order {
    void placeOrder(String item) {
        System.out.println("Ordering: " + item);
    }

    void placeOrder(String item, int quantity) {
        System.out.println("Ordering " + quantity + " x " + item);
    }

    void placeOrder(String item, int quantity, String address) {
        System.out.println("Ordering " + quantity + " x " + item + " to " + address);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder("Pizza");
        order.placeOrder("Burger", 2);
        order.placeOrder("Pizza", 3, "Chandigarh");
    }
}
