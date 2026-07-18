package Basics;

import java.util.ArrayList;
import java.util.Arrays;

public class A0020StringAndStringBuilder {
    public static void main(String[] args) {
        stringEqualities();
        formattedPrint();
        ASCII();
        plusWorking();
        ABC();
        SB();

        String name = "Gunin Sangar";
        char[] arr = name.toCharArray();
        System.out.println(Arrays.toString(arr));

        String whitespace = "        White         Spaces          ";
        System.out.println(whitespace.strip());

        String name2 = "Random NPC brim";
        String[] arr1 = name2.split(" ");
        System.out.println(Arrays.toString(arr1));

        isPalindrome("acbca");
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

    public static void ABC() {
        // it only looks like O(n) but is O(n^2)
        // as each time a new string obj is created like
        // a, ab, abc, abcd, ... abc-xyz which is like 1+2+3+...N = N(N+1)/2
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch + " ";
        }
        System.out.println(series);
        System.out.println();
    }

    public static void SB() {
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch + " ");
        }
        System.out.println(series);
        System.out.println();
    }

    public static void isPalindrome(String s) {
        String s1 = s.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}