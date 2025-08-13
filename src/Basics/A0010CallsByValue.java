package Basics;

public class A0010CallsByValue {
    // MEMORY IN JAVA [Call stack]
    // java stores fns in a stack ... like main() and swap()
    // main has int a and int b
    // swap has copy of int a and int b
    // both are not same ... changes made to one fn will remain under it only



    // CALLS BY VALUE
    // where a copy of the original argument is formed in the function


    // CALLS BY REFERENCE [possible in cpp]
    // A method gets a reference to the same memory location
    // of the variable, so changes inside the method affect the original variable

    // there is no such function formed in java ...


    public static void main(String[] args) {
        // NOTE
        // The changes made to a and b inside of swap method will remain changed only inside the swap method
        // They will not affect the value of a and b inside the main method
        int a = 5;
        int b = 10;
        swap(a,b);
        System.out.println();

        System.out.println("-- print fn through main method --");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("-- print fn through swap method --");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }
}
