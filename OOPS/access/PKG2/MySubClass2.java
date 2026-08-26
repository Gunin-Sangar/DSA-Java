package OOPS.access.PKG2;

import OOPS.access.PKG1.MyClass;

// Subclass (diff pkg)
public class MySubClass2 extends MyClass {

    public MySubClass2(String name, int age, int experience, boolean isAlwaysLearning) {
        super(name, age, experience, isAlwaysLearning);
    }

    static void main(String[] args) {
        // public protected no-modifier private
        MyClass obj1 = new MyClass("Gunin", 19, 0, true);
        System.out.println(obj1.name);
        // System.out.println(obj1.age);              cant access outside pkg using superclass reference
        // System.out.println(obj1.experience);       cant access outside pkg [no modifier]
        // System.out.println(obj1.isAlwaysLearning); cant access outside class [private]

        MySubClass2 obj2 = new MySubClass2("Gunin", 19, 0, true);
        System.out.println(obj2.name);

        // protected member can be accessed here because
        // MySubClass2 is a subclass of MyClass and is in a different package,
        // and the access is through a MySubClass2 reference.
        System.out.println(obj2.age);

        // System.out.println(obj2.experience);       cant access outside pkg [no modifier]
        // System.out.println(obj2.isAlwaysLearning); cant access outside class [private]
    }
}
