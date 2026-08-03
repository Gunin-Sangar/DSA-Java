package OOPS.A002OOPS.StaticMeaning1;

import static OOPS.A002OOPS.StaticMeaning2.StaticImport.msg;

public class UnderstandingStatic {
    public static void main(String[] args) {
        System.out.println("Hello mittr!!!");
        msg();

        Human h1 = new Human("Gunin", 19, 10000, false);
        Human h2 = new Human("Luffy", 19, 3000000000L, false);
        h1.display();
        h2.display();

        Human.greeting();
        h1.greet();    // Human.greet(); wont work ... requires an object for non-static method
        Human.sgAndNsg();
    }

    /** 'static' keyword is used for variable stating universal facts .
     *  For instance: for any human the population will always be the same.
     *  We use 'static' keyword means that it belongs to the class and not the object.
     *  It means i can use the 'population' before creating 'h1' or 'h2' in my code.
     */
    public static class Human{
        String name;
        int age;
        long salary;
        boolean married;
        static long population;
        static String planet = "Earth";
        static String species = "Homo sapiens";

        public Human() {}
        public Human(String name, int age, long salary, boolean married) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.married = married;
            Human.population += 1;
        }

        // object independent method
        public static void greeting(){
            System.out.println("static greeting() method");
            System.out.println();
        }

        // object dependent method
        public void greet(){
            System.out.println("non-static greet() method");
            System.out.println();
        }

        // static greeting() and non-static greet()
        public static void sgAndNsg(){
            // You cant use this as it requires an object instance
            // but the function we are using does not require any object instance
            // greet();   To make it work heres a trick
            Human obj = new Human();
            System.out.println("This is greet() from sgAndNsg");
            obj.greet();
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Married: " + married);
            System.out.println("Population: " + population);
            System.out.println("Planet: " + planet);
            System.out.println("Species: " + species);
            System.out.println();
        }
    }
}
