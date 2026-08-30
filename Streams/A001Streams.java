package Streams;

import java.util.ArrayList;
import java.util.List;

public class A001Streams {

    public static void main(String[] args) {
        streamLearn();
    }


    public static void streamLearn() {

        System.out.println("-- Stream API --");

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(24);
        list.add(1);
        list.add(14);
        list.add(100);

        System.out.println("Original : " + list);

        // Filter
        List<Integer> even = list.stream()
                .filter(num -> num % 2 == 0)
                .toList();

        System.out.println("Filter(Even) : " + even);

        // Map
        List<Integer> square = list.stream()
                .map(num -> num * num)
                .toList();

        System.out.println("Map(Square) : " + square);

        // Sorted
        List<Integer> sorted = list.stream()
                .sorted()
                .toList();

        System.out.println("Sorted : " + sorted);

        // Count
        long count = list.stream()
                .count();

        System.out.println("Count : " + count);

        // Find First
        System.out.println(
                "FindFirst : " +
                        list.stream().findFirst().get()
        );

        // Any Match
        System.out.println(
                "AnyMatch > 50 : " +
                        list.stream().anyMatch(num -> num > 50)
        );

        // All Match
        System.out.println(
                "AllMatch > 0 : " +
                        list.stream().allMatch(num -> num > 0)
        );

        // Reduce (Sum)
        int sum = list.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum : " + sum);

        // forEach
        System.out.println("forEach");
        list.stream().forEach(System.out::println);

        System.out.println();
    }

}








//// Stream
//list.stream();                             // Create Stream
//
//.filter(x -> condition)                    // Filter
//        .map(x -> newValue)                        // Transform
//        .sorted()                                  // Sort
//.distinct()                                // Remove duplicates
//.limit(n)                                  // First n elements
//.skip(n)                                   // Skip first n elements
//
//.count();                                  // Count
//.findFirst();                              // First element
//.anyMatch(x -> condition);                 // Any satisfies?
//        .allMatch(x -> condition);                 // All satisfy?
//        .noneMatch(x -> condition);                // None satisfy?
//        .reduce(0, Integer::sum);                  // Sum
//.forEach(System.out::println);             // Print
//.toList();                                 // Convert to List