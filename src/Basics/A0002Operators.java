package Basics;

@SuppressWarnings("ALL")
public class A0002Operators {
    public static void main(String[] args) {
        // Operators
        // Arithmetic operator
        System.out.println("-- Arithmetic operator --");
        System.out.println("This is 2 + 5 : " + (2 + 5));
        System.out.println("This is 2 - 5 : " + (2 - 5));
        System.out.println("This is 2 * 5 : " + (2 * 5));
        System.out.println("This is 2 % 5 : " + (2 % 5));
        System.out.println("This is 2 % 5.0 : " + (2 % 5.0));  // Ensure floating-point division
        System.out.println("This is 2 / 5 : " + (2 / 5));
        System.out.println("This is 2 / 5.0 : " + (2 / 5.0));  // Ensure floating-point division
        System.out.println();

        //Pre - Increment
        System.out.println("-- Pre - Increment --");
        int x = 5;
        int y = ++x;
        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
        System.out.println();

        //Post - Increment
        System.out.println("-- Post - Increment --");
        int a = 5;
        int b = a++;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println();

        // Taking exponents
        System.out.println("-- Taking exponents --");
        System.out.println("This is 2 ^ 4 : " + Math.pow(2, 4)); // Math.pow for exponents
        System.out.println("This is -3 ^ 2 : " + Math.pow(-3, 2));
        System.out.println("This is Math.floor(13.5 / 2) : " + Math.floor(13.5 / 2)); // Floor division
        System.out.println();

        // Arithmetic operators
        System.out.println("-- Arithmetic operators --");
        System.out.println("This is 2 > 5 : " + (2 > 5));
        System.out.println("This is 2 <= 5 : " + (2 <= 5));
        System.out.println("This is 2 == 5 : " + (2 == 5));
        System.out.println();

        //'AND' and 'OR' operator
        System.out.println("-- 'AND' and 'OR' operator --");
        System.out.println("This is (2 < 5) and (5==2) : " + ((2 < 5) && (5 == 2)));
        System.out.println("This is (2 < 5) or (5==2) : " + ((2 < 5) || (5 == 2)));
        System.out.println("This is not (5 == 2) : " + (!(5 == 2)));
        System.out.println();

        // Bitwise operators
        System.out.println("-- Bitwise operators --");
        System.out.println("This is ~2 : " + (~2));
        System.out.println("This is 10 << 2 : " + (10 << 2));
        System.out.println("This is 10 >> 2 : " + (10 >> 2));
        System.out.println();

        // Bitwise AND, OR, XOR operators
        System.out.println("-- Bitwise AND, OR, XOR operators --");
        // 9→1001
        //10→1010
        System.out.println("This is 9 & 10 : " + (9 & 10));
        System.out.println("This is 9 | 10 : " + (9 | 10));
        System.out.println("This is 9 ^ 10 : " + (9 ^ 10));
        System.out.println();

        // Using the Math library
        System.out.println("-- Using the Math library --");
        System.out.println("Using math library");
        double var1 = 2;
        double var2 = 3;
        System.out.println("Round fn: " + Math.round(var1 / var2));
        System.out.println("math.floor fn: " + Math.floor(var1 / var2));
        System.out.println("math.ceil fn: " + Math.ceil(var1 / var2));
        System.out.println("pow fn: " + Math.pow(var1, var2));
    }
}
