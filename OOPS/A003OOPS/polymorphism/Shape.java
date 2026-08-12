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
        // Upcasting  [the process of casting a child class object to a parent class reference type]
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


/*
Dynamic Method Dispatch [during run time polymorphism]

Dynamic Method Dispatch is the mechanism by which Java determines
which overridden method to execute at runtime based on the actual
object type, not the reference type.

Here:
- Reference type = Shape
- Object type = Square
- name() is overridden in Square
- Therefore, Square's name() method is called at runtime.

Output:
Square method

Important:
Reference type → decides which field is accessed
Object type    → decides which overridden method is executed
*/