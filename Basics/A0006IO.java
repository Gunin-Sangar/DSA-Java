package Basics;

import java.util.Scanner;

// FunFact
// if u type next() and then nextLine()
// Then the output will only take input of the next() and ignore the nextLine()
// Why as the next() only reads till the special characters or whitespace and leaves that in the buffer.
// so that /n or " " or anything else is read by the nextLine() and shows no output as it outputs the /n which is not visible.

// Example if u write name1 = "aaa bbb" in next(),then due to whitespace, name1 = "aaa" and name2 = "bbb" in the below code.
// Always use sc.nextLine() carefully after sc.next(), sc.nextInt(), or similar methods

// sc.nextLine(); can resolve this error no problem!!!

// but if u type next() and then next() then all good (but be careful)(whitespace issue)
// but if u type nextLine() and then next() then all good
//               nextLine() and then nextLine() then all good

/* REASONING
    FunFact: Mixing next() and nextLine() can cause bugs.
    next() → reads one word (up to space or newline)
    nextLine() → reads the rest of the line (until \n)

    ⚠️ Issue:
         next() leaves the newline \n in the buffer.
         So calling nextLine() after next() will just read that leftover \n and return an empty string.

    ✅ Fix:
        Always use sc.nextLine(); once after next(), nextInt(), etc. to clear the buffer.

         Example:
         Input: "aaa bbb"
         String a = sc.next();     // reads "aaa"
         String b = sc.nextLine(); // reads leftover '\n' → returns ""
         To fix: call sc.nextLine(); before reading b.
        */


public class A0006IO {
    public static void main(String[] args){
        Scanner  sc= new Scanner(System.in);

        //stores all value ... till whitespace or special character
        System.out.println("-- next() --");
        System.out.println("Enter your name :");
        String name1 = sc.next();
        System.out.println();

        //stores all value ... till whitespace or special character
        System.out.println("-- next() --");
        System.out.println("Enter your name :");
        String name2 = sc.next();
        System.out.println();

        System.out.println("This is name1 " + name1);
        System.out.println("This is name2 " +name2);
        System.out.println();

        // Clear the buffer before using nextLine()
        sc.nextLine();

        System.out.println("-- nextLine() --");
        System.out.println("Enter your name :");
        String name3 = sc.nextLine();
        System.out.println("This is name3 :" + name3);

        sc.close();
    }
}
