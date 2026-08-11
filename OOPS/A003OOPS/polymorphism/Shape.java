package OOPS.A003OOPS.polymorphism;

public class Shape {
    String name = "Shape";
    void name() {
        System.out.println("Shape method");
    }
    /**
    variables are not dynamically dispatched or polymorphic
    but overridden methods are polymorphic

    variables/Field → decided by reference type
    methods → decided by object type
    **/
    static void main(String[] args) {
        Shape s = new Square();
        System.out.println(s.name);
        s.name();
    }
}

class Square extends Shape {
    String name = "Square";
    /**
    learned that @Override is a compile time check
    basically tells java that "I intend this method to override a method from the parent class"
    It is debuggers help
    **/
    @Override
    void name() {
        System.out.println("Square method");
    }
}