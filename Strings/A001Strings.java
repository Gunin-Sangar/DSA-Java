package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class A001Strings {
    public static void main(String[] args) {
        stringEqualities();
        formattedPrint();
        ASCII();
        plusWorking();
        WhiteSpace();
    }

    public static void stringEqualities() {
        // this points to same object [heap memory]
        String name1 = "Clash of clans";
        String name2 = "Clash of clans";
        String name3 = new String("Clash of clans");

        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name2 == name3: " + (name2 == name3));
        // To compare values of the strings use the .equal method
        System.out.println("name2.equals(name3): " + name2.equals(name3));
        System.out.println();

        System.out.println("name1: " + System.identityHashCode(name1));
        System.out.println("name2: " + System.identityHashCode(name2));
        System.out.println("name3: " + System.identityHashCode(name3));
        System.out.println();
    }

    public static void formattedPrint() {
        float num = 453.1234f;
        System.out.printf("Formatted float:                  %.2f \n", num);
        System.out.printf("Pi value is:                      %.5f \n", Math.PI);
        System.out.printf("number printed using format is:   %d \n", 45);
        System.out.printf("string printed using format is:   %s \n", "Gunin");
        System.out.println();
    }

    public static void ASCII() {
        // ASCII character
        System.out.printf("value of 'a' + 'b': %d \n", 'a' + 'b'); // adds int value of a = 97, b =98
        System.out.println("value of \"a\" + \"b\": " + "a" + "b"); // Concatenation
        System.out.println("value of (char)('a' + 3): " + (char) ('a' + 3));
        System.out.println();
    }

    public static void plusWorking() {
        // the Plus (+) operator works with all primitives.
        // the Plus (+) operator works with all non-primitives, but only if one of them is String.
        System.out.println("Gunin " + new ArrayList<>());
        System.out.println("Gunin " + new Integer(45));

        // That is why this shows error (2nd comment)
        // System.out.println(new Integer(45) + new ArrayList<>());

        // That is why this won't (2nd comment)
        String ans = new Integer(45) + " " + new ArrayList<>();
        System.out.println(ans);
        System.out.println();
    }
    
    public static void WhiteSpace(){
        String str1 = "  Hello       World     ";
        // removes leading and ending whitespaces
        String stripped =  str1.strip();

        System.out.println(str1);
        System.out.println(stripped);
        System.out.println(stripped.replaceAll("\\s",""));

        String str2 = Arrays.toString(stripped.split("\\s+", 2));
        System.out.println(str2);

        String str3 = String.join(" ", stripped.split("\\s+", 2));
        System.out.println(str3);

        String arr1 = "Kunal Apoorv Rahul Snehal";
        String[] names = arr1. split(" ");
        System.out.println(Arrays.toString(names));

        String role = "Senior Ai Engineer";
        char[] arr2 = role.toCharArray();
        System.out.println(Arrays.toString(arr2));
    }
}