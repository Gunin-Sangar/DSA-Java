package Basics;

import java.util.Scanner;
import java.lang.Math;

// FunFact
// If you try any number bigger than 10 → The code won't work
// Also the code isn't working for double data type


public class A0007Problems {
    public static void main(String[] args) {

        // Counting digits in a number
        System.out.println("-- Counting digits in a number --");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1 = sc.nextInt();
        int numberOfDigits = 0;
        while (n1 > 0) {
            n1 = n1 / 10;
            numberOfDigits++;
        }
        System.out.println("Counting digits in a number : " + numberOfDigits);
        System.out.println();



        // Sum of the digits of a number
        System.out.println("-- Sum of the digits of a number --");
        System.out.print("Enter a number : ");
        int n2 = sc.nextInt();
        int sum2 = 0;
        int lastDigit2;
        while (n2 > 0) {
            lastDigit2 = n2 % 10;
            n2 = n2 / 10;
            sum2 += lastDigit2;
        }
        System.out.println("Sum of the digits of a number : " + sum2);
        System.out.println();



        // Reversing the order of a number
        System.out.println("-- Reversing the order of a number --");
        System.out.print("Enter a number : ");
        int n3 = sc.nextInt();
        int result3 = 0;
        while (n3 > 0) {
            result3 = (result3 * 10) + (n3 % 10);
            n3 = n3 / 10;
        }
        System.out.println("Reversing the order of a number : " + result3);
        System.out.println();



        // Sum of series → S = 1 - 2 + 3 - 4 + 5 + ... + n
        System.out.println("-- Sum of series → S = 1 - 2 + 3 - 4 + 5 + ... + n --");
        System.out.print("Enter a 'n' : ");
        int n4 = sc.nextInt();
        int result4 = 0;
        for (int i = 0; i <= n4; i++) {
            if (i % 2 == 0) {
                result4 -= i;
            } else {
                result4 += i;
            }
        }
        System.out.println("Sum of series → S = " + result4);
        System.out.println();



        // Factorial of the 1st 'n' numbers
        System.out.println("-- Factorial of the 1st 'n' numbers --");
        System.out.print("Enter a number : ");
        int n5 = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of the 'n' numbers : " + factorial);
        System.out.println();



        // Checking if prime number
        System.out.println("-- Checking if prime number --");
        System.out.print("Enter a number : ");
        int n6 = sc.nextInt();
        boolean isPrime = true;
        // iterating from 2 to n-1
        for (int i = 2; i <= Math.sqrt(n6); i++) {
            if (n6 % i == 0) {
                isPrime = false;
                break;
            }
        }
        // exceptional case of 2 [cause of the way you code stuff]
        if(n6 == 2){
            isPrime = true;
        }
        // printing out solutions
        if (isPrime) {
            System.out.println(n6 + " is a prime number");
        }
        if (!isPrime) {
            System.out.println(n6 + " is a composite number");
        }
        System.out.println();



        // Binary to decimal conversion
        // Consider n7 as a binary number [ in the form of bits ... 1,0]
        System.out.println("-- Binary to decimal conversion --");
        System.out.print("Enter a Binary number : ");
        int bin7 = sc.nextInt();
        int lastDigit7;
        int decimal7 = 0;
        int pow7 = 0;
        while(bin7 > 0){
            lastDigit7 = bin7 % 10;
            decimal7 = decimal7 + (int)(lastDigit7 * Math.pow(2,pow7));
            bin7 = bin7 /10;
            pow7++ ;
        }
        System.out.println("The decimal conversion is : " + decimal7);
        System.out.println();



        // Decimal to Binary conversion
        System.out.println("-- Decimal to Binary conversion --");
        System.out.print("Enter a decimal number : ");
        int decimal8 = sc.nextInt();
        int bin8 = 0;
        int rem8;
        int pow8 = 0;
        while(decimal8 > 0){
            rem8 = decimal8 % 2;
            bin8 = bin8 + (rem8 * (int)Math.pow(10,pow8));
            pow8++;
            decimal8 = decimal8 / 2;
        }
        System.out.println("The Binary conversion is : " + bin8);
        System.out.println();
    }
}
