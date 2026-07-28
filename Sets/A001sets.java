package Sets;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A001sets {

    public static void main(String[] args) {
        hashSetLearn();
        LinkedHashSetLearn();
        TreeHashSetLearn();

        System.out.println("-- Length of LongestSubString [without duplicates] --");
        String a = "pwwkew";
        System.out.println("LongestSubString: " + lengthOfLongestSubstring(a));
    }



    public static void hashSetLearn() {

        System.out.println("-- HashSet --");

        // Syntax
        Set<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println("Set : " + set);

        // Size
        System.out.println("Size : " + set.size());

        // Contains - T/F
        System.out.println("Contains 10 : " + set.contains(10));
        System.out.println("Contains 100 : " + set.contains(100));

        // removes element
        System.out.println("Remove 20 : " + set.remove(20));

        // Empty - T/F
        System.out.println("isEmpty : " + set.isEmpty());

        // Iteration
        System.out.print("Elements : ");
        for(Integer x : set) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Clear -- empties the set
        set.clear();

        System.out.println("After clear : " + set);

        System.out.println();
    }



    public static void LinkedHashSetLearn() {

        System.out.println("-- LinkedHashSet --");

        // Syntax
        Set<String> set = new LinkedHashSet<>();

        // Add
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Apple");

        System.out.println(set);

        // Contains
        System.out.println("Contains Banana : " + set.contains("Banana"));

        // Removes
        set.remove("Orange");

        System.out.println(set);

        // Iteration
        for(String s : set) {
            System.out.println(s);
        }

        System.out.println();
    }



    public static void TreeHashSetLearn() {

        System.out.println("-- TreeHashSet --");

        //Syntax
        TreeSet<Integer> set = new TreeSet<>();

        // Add
        set.add(40);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(30);

        System.out.println(set);

        // First
        System.out.println("First : " + set.first());

        // Last
        System.out.println("Last : " + set.last());

        // Higher
        System.out.println("Higher(30) : " + set.higher(30));

        // Lower
        System.out.println("Lower(30) : " + set.lower(30));

        // Ceiling
        System.out.println("Ceiling(35) : " + set.ceiling(35));

        // Floor
        System.out.println("Floor(35) : " + set.floor(35));

        // Remove
        set.remove(20);

        System.out.println(set);

        System.out.println();
    }



    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}


//set.add(x);          // Add element
//set.remove(x);       // Remove element
//set.contains(x);     // Check element
//set.size();          // Number of elements
//set.clear();         // Remove all
//set.isEmpty();       // Check empty