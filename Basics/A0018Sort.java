package Basics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class A0018Sort {
    public static void main(String[] args) {

        // Bubble sort
        int[] arr1 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        bubbleSort(arr1, 0);
        System.out.println("bubbleSort 0 A: " + Arrays.toString(arr1));

        int[] arr2 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        bubbleSort(arr2, 1);
        System.out.println("bubbleSort 1 D: " + Arrays.toString(arr2));

        System.out.println();

        // Selection sort
        int[] arr3 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        selectionSort(arr3, 0, arr3.length, 0);
        System.out.println("selectionSort 0 min A: " + Arrays.toString(arr3));

        int[] arr4 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        selectionSort(arr4, 0, arr4.length, 1);
        System.out.println("selectionSort 1 min D: " + Arrays.toString(arr4));

        int[] arr5 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        selectionSort(arr5, 0, arr5.length, 2);
        System.out.println("selectionSort 2 max A: " + Arrays.toString(arr5));

        int[] arr6= {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        selectionSort(arr6, 0, arr6.length, 3);
        System.out.println("selectionSort 1 max D: " + Arrays.toString(arr6));

        System.out.println();

        // Insertion sort
        int[] arr7= {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        insertionSort(arr7, true);
        System.out.println("insertionSort true A: " + Arrays.toString(arr7));

        int[] arr8= {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        insertionSort(arr8, false);
        System.out.println("insertionSort false D: " + Arrays.toString(arr8));

        System.out.println();

        int[] arr9= {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        // sort excludes end index. so this sort the index 3-7 [not 8]
        Arrays.sort(arr9, 3,8);
        System.out.println("inbuilt Arrays.sort(arr9,3,8): " + Arrays.toString(arr9));

        // Collection.reverseOrder() only works with wrapper classes
        // but wrapper classes also provide utility method so they are not bad
        // they can also store null unlike primitive data types
        Integer[] arr10= {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        Arrays.sort(arr10, Collections.reverseOrder());
        System.out.println("inbuilt Arrays.sort(arr10): " + Arrays.toString(arr10));

        System.out.println();

        int[] arr11 = {1,1,4,3,5,3,7,5,6};
        countingSort(arr11);
        System.out.println("countingSort: " + Arrays.toString(arr11));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void bubbleSort(int[] arr, int order) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Ascending order
                if (order == 0) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j+1);
                    }
                }

                // Descending order
                if (order == 1) {
                    if (arr[j] < arr[j + 1]) {
                        swap(arr, j, j+1);
                    }
                }
            }
        }
    }

    public static void selectionSort(int[] arr, int low, int high, int order) {
        if (low >= high-1) {
            return;
        }
        int minIndex = low;
        int maxIndex = low;

        // Min Ascending order
        if(order == 0){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            swap(arr, minIndex,low);
            selectionSort(arr, low+1, high,order);
        }

        // Min Descending order
        if(order == 1){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            swap(arr, minIndex,high-1);
            selectionSort(arr, low, high - 1,order);
        }

        // Max Ascending order
        if(order == 2){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(arr, maxIndex,high-1);
            selectionSort(arr, low, high-1, order);
        }

        // Max Descending order
        if(order == 3){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            swap(arr, maxIndex,low);
            selectionSort(arr, low+1, high, order);
        }
    }

    // learned this using gpt: call me impressed -> for boolean use
    // also, writing else{} will help you skip an expression [no validation] so its faster/efficient [slightly]
    public static void insertionSort(int[] arr, boolean ascending) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            if (ascending) {
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            } else {
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
            }
            arr[j + 1] = key;
        }
    }

    public static void countingSort(int[] arr1) {

        int max = arr1[0];
        for (int num : arr1) {
            if (num > max) {
                max = num;
            }
        }
        int[] count = new int[max + 1];

        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }
    }
}