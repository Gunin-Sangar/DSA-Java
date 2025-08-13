package Basics;

public class A0013Searches {
    public static void main(String[] args) {

        // linearSearch() : int
        System.out.println("-- linearSearch() : int --");
        int[] arr = {25, 67, 45, 98, 23, 54, 65, 128, 213}; // 9 --> index [0:8]
        int result = linearSearch(arr, 65);
        if (result != -1) {
            System.out.println("Index Found: " + result + " = " + arr[result]);
        } else {
            System.out.println("Index Not Found");
        }
        System.out.println();

        //  binarySearch() : int
        System.out.println("-- binarySearch() : int --");
        result = binarySearch(arr, 23);
        if (result != -1) {
            System.out.println("Index Found: " + result + " = " + arr[result]);
        } else {
            System.out.println("Index Not Found");
        }
        System.out.println();

        //  recursiveBinarySearch() : int
        System.out.println("-- recursiveBinarySearch() : int --");
        result = recursiveBinarySearch(arr, 128, 0,11);
        if (result != -1) {
            System.out.println("Index Found: " + result + " = " + arr[result]);
        } else {
            System.out.println("Index Not Found");
        }
        System.out.println();
    }



    // LinearSearch : int
    public static int linearSearch(int[] arr, int target) {
        // iterating array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // index not found
        return -1;
    }



    // BinarySearch : int
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // loop till low and high overlap ... then stop
        while (low <= high) {
            // To avoid overflow --> optimised
            int mid = low + (high - low) / 2;

            // new mid
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // index not found
        return -1;
    }



    //  recursiveBinarySearch() : int
    public static int recursiveBinarySearch(int[] arr, int key, int low, int high) {
        // index not found
        if (low > high) {
            return -1;
        }
        // optimised mid
        int mid = low + (high - low) / 2;

        // recursion
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return recursiveBinarySearch(arr, key, low, mid - 1);
        } else {
            return recursiveBinarySearch(arr, key, mid + 1, high);
        }
    }
}