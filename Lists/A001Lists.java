package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A001Lists {

    public static void main(String[] args) {
        arrayListLearn();
        listOfLearn();
    }


    public static void arrayListLearn() {

        System.out.println("-- ArrayList --");

        // Syntax
        List<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List : " + list);

        // Add at Index
        list.add(1, 15);

        System.out.println("After Add(Index) : " + list);

        // Get
        System.out.println("Get(2) : " + list.get(2));

        // Set (Update)
        list.set(2, 100);

        System.out.println("After Set : " + list);

        // Remove by Index
        list.remove(1);

        System.out.println("After Remove(Index) : " + list);

        // Remove by Value
        list.remove(Integer.valueOf(40));

        System.out.println("After Remove(Value) : " + list);

        // Contains
        System.out.println("Contains(100) : " + list.contains(100));

        // Index Of
        System.out.println("IndexOf(100) : " + list.indexOf(100));

        // Size
        System.out.println("Size : " + list.size());

        // Iteration
        System.out.println("Iteration");
        for (Integer num : list) {
            System.out.println(num);
        }

        // isEmpty
        System.out.println("isEmpty : " + list.isEmpty());

        // Clear
        list.clear();

        System.out.println("After Clear : " + list);

        System.out.println();
    }



    public static void listOfLearn() {

        System.out.println("-- List.of() --");

        List<String> list = List.of("Java", "Python", "C++");

        System.out.println("List : " + list);

        System.out.println("Get(1) : " + list.get(1));

        System.out.println("Contains(Java) : " + list.contains("Java"));

        System.out.println("Size : " + list.size());

        System.out.println("Iteration");
        for (String lang : list) {
            System.out.println(lang);
        }

        System.out.println();
    }

}





//// List
//List<Integer> list = new ArrayList<>();
//
//list.add(x);                  // Add
//list.add(index, x);           // Add at index
//list.get(index);              // Get
//list.set(index, x);           // Update
//list.remove(index);           // Remove by index
//list.remove(Integer.valueOf(x)); // Remove by value
//        list.contains(x);             // Contains
//list.indexOf(x);              // Index
//list.size();                  // Size
//list.clear();                 // Remove all
//list.isEmpty();               // Check empty