package OOPS.A004OOPS.PKG1;

import OOPS.A004OOPS.PKG2.MySubClass2;

// Subclass (same pkg)
public class MySubClass1 extends MyClass{

    public MySubClass1(String name, int age, int experience, boolean isAlwaysLearning) {
        super(name, age, experience, isAlwaysLearning);
    }

    static void main(String[] args) {
        // public protected no-modifier private
        MyClass obj1 = new MyClass("Gunin", 19, 0, true);
        System.out.println(obj1.name);
         System.out.println(obj1.age);
         System.out.println(obj1.experience);
        // System.out.println(obj1.isAlwaysLearning); cant access outside class [private]

        MySubClass1 obj2 = new MySubClass1("Gunin", 19, 0, true);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
         System.out.println(obj2.experience);
        // System.out.println(obj2.isAlwaysLearning); cant access outside class [private]
    }
}
