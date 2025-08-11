package Basics;

import java.util.Scanner;

// FunFact
// If - else statements works without the curly brackets ... but only one line codes gets executed
// If I had written 2 lines under if statement rather than 1 line, then the code won't compile.
// You can write any amount of lines under the else statement though... idc Y

////Try it
////        public static void main(String[] args) {
////            int num = 7;
////            if(num%2==0)
////                System.out.println("even");
////            else System.out.println("odd");
////        }

public class A0004Conditionals {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : even or odd");
        int age = sc.nextInt();

        // Shorthand for if - else statement
        // The Ternary operator
        System.out.println("-- Ternary operator --");
        String ans = (age % 2 == 0)? "even" : "odd";
        System.out.println("The value of number : " + ans);
        System.out.println();

        // if - else statement
        System.out.println("-- if-else statement --");
        int A = 10;
        int B = 24;
        int C = 5;
        System.out.println("A= 10 || B = 24 || C = 5");
        if ((A > B) && (A > C)) {
            System.out.println("\"A\" is the largest number in the three");
        } else if (B > C) {
            System.out.println("\"B\" is the largest number in the three");
        } else {
            System.out.println("\"C\" is the largest number in the three");
        }
        System.out.println();


        // Switch case
        // Calculator
        System.out.println("-- Switch case based calculator --");
        System.out.println("Enter number D: ");
        int D = sc.nextInt();
        System.out.println("Enter number E: ");
        int E = sc.nextInt();
        System.out.println("Enter any operator: ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' :
                System.out.println("D + E = " + (D+E));
                break;
            case '-':
                System.out.println("D - E = " + (D-E));
                break;
            case '*':
                System.out.println("D * E = " + D*E);
                break;
            case '/':
                System.out.println("D / E = " + D/E);
                break;
            case '%':
                System.out.println("D % E = " + D%E);
                break;
            case '^':
                System.out.println("D + E = " + Math.pow(D,E));
                break;
            default:
                System.out.println("Enter a proper operator!!!");
                break;
        }
        sc.close();
    }
}
