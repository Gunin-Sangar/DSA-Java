package Basics;

public class A0011MethodScope {
    // Method scope --> A and B are swapped inside swap method only
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + " is called from swap method()");
        System.out.println("b = " + b + " is called from swap method()");
        System.out.println();
    }

    public static void main(String[] args) {
        // -- Method Scope --
        System.out.println("-- Method Scope --");
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println("a = " + a + " is called from main method()");
        System.out.println("b = " + b + " is called from main method()");
        System.out.println();

        // -- Block Scope --
        // this is a block of code || scope is limited to inside the block
        {
            System.out.println("-- Block Scope --");
            int s = 45;
            System.out.printf("This is %s from inside a Block",s);
            System.out.println();
        }
        // System.out.println(s); // throws error as s is not declared
        System.out.println();


        // -- Another Block scope example --
        System.out.println("-- Another Block scope example --");
        System.out.println("Block scope example : For loop");
        for(int i =0; i < 5; i++){
            System.out.print(i + " ");
        }
        //System.out.println(i); // throws error as 'i' is not declared


    }
}
