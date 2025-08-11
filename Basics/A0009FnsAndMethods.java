package Basics;

import java.util.Scanner;

public class A0009FnsAndMethods {
    // Add method
    public static int add(int a, int b) { // These are parameters or formal parameters
        return a + b;
    }

    // Recursive factorial method
    public static int factorial(int n) { // These are parameters or formal parameters
        if (n == 1) {
            return 1;
        } else {
            n = n * factorial(n - 1);
            return n;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Add method
        System.out.println("-- Add method --");
        System.out.print("Adding || Enter num1 :");
        int a = sc.nextInt();
        System.out.print("Adding || Enter num2 :");
        int b = sc.nextInt();
        int sum = add(a, b); // these are arguments || actual parameters
        System.out.println("Sum of args : " + sum);
        System.out.println();

        // Recursive factorial method
        System.out.println("-- Recursive factorial method --");
        System.out.print("Enter any number to get its factorial :");
        int number = sc.nextInt();
        System.out.println(factorial(number)); // these are arguments || actual parameters
    }
}
