package OOPS.interfaces.FunctionalInterface;

public class FuncInterface {
    static void main(String[] args) {
        Operation add = (a,b) -> a+b; //  Integer::sum
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;

        System.out.println("Operation add: " + add.operate(10,20));
        System.out.println("Operation sub: " + sub.operate(10,20));
        System.out.println("Operation mul: " + mul.operate(10,20));
        System.out.println("Operation div: " + div.operate(10,20));
    }

    // basically an interface with only one abstract method
    // allows the use of lambda expression like used above
    @FunctionalInterface // this annotation is just a compile time check
    private interface Operation{
        int operate(int a, int b);
    }
}
