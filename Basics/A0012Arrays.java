package Basics;

import java.util.Arrays;

// FunFact
// new keyword is used to give a slot in the memory as can be inferred
// from the syntax --> new int[45]

public class A0012Arrays {
    public static void main(String[] args) {

        // Array declaration and initialisation
        System.out.println("-- Array declaration and initialisation and indexing --");
        // array ---> A with 5 elements [declared but not initialized]
        int[] arr1 = new int[5];
        System.out.println("This is A[1] : " + arr1[1]);
        // array ---> B [declared but initialized]
        int[] arr2 = {10, 34, 23, 45, 65};
        System.out.println("This is B[2] : " + arr2[2]);
        System.out.println();



        // Array References and Copying Arrays
        System.out.println("-- Array References and Copying Arrays --");
        int[] arr3 = { 1, 2, 3 };
        int[] arr4 = { 4, 7, 6 };
        // the reference in arr3 will be changed to that of arr4
        // meaning that arr3 and arr4 will both refer to the same array object [or memory address]:
        arr3 = arr4;
        arr4[1] = 5;
        // for each loop
        System.out.print("This is arr3 : ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        // for each loop
        System.out.print("This is arr4 : ");
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();



        // testing reverseArray() : void
        System.out.println("-- reverseArray() : void --");
        int[] arr5 = {0,1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr5);
        System.out.println("Reversed Array : " + Arrays.toString(arr5));
        reverseArray(arr5);
        System.out.println("Reversed Array Again : " + Arrays.toString(arr5));
        System.out.println();

        // printPairs() : void + System.out.println();
        System.out.println("-- printPairs() : void --");
        System.out.println("Printing paris in an array : ");
        printPairs(arr5);
        System.out.println();
    }


    // reversing an array : void
    public static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int temp;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }


    // printing pairs : void + System.out.print();
    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; // 2, 4, 6, 8, 10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
}

/*
==================== ARRAYS IN JAVA ====================
    -- Definition --
    An array is a collection of elements of the **same data type**
    stored in **contiguous memory locations** and accessed via an index.

    -- contiguous means to share a common border --
    so if we store [a, b, c] in an array and a has memory address of (say)1000
    then memory address of b = 1001 and c = 1002

    -- Syntax --
        datatype[] arrName = new datatype[size];
        datatype[] arrName = {val1, val2, val3};

    -- Features --
        1. Fixed size (cannot grow/shrink once created).
        2. index starts at 0 [Zero-based indexing].
        3. Can store both primitive types and objects.
        4. Access time is O(1) (direct index access).
        5. Default initialization:
            - byte, short, int, long → 0
            - float, double → 0.0
            - char → '\u0000' (null char)
            - boolean → false
            - Object references → null

    -- Example: Default Values --
    int[] nums = new int[3];        // [0, 0, 0]
    boolean[] flags = new boolean[3]; // [false, false, false]
    String[] names = new String[3]; // [null, null, null]

    -- Example: Initialization --
    int[] arr1 = {1, 2, 3, 4};
    String[] arr2 = new String[]{"A", "B"};
    int[] arr3 = new int[5]; // default values

    -- Access & Update --
    arr1[0] = 10;       // update
    int x = arr1[2];    // access

    -- Looping --
    for(int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[i]);
    }

    -- Enhanced for loop --
    for(int value : arr1) {
        System.out.println(value);
    }
*/

