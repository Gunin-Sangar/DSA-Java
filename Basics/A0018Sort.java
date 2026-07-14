package Basics;

import java.util.Arrays;

public class A0018Sort {
    public static void main(String[] args) {
        // Bubble
        int[] arr1 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        bubbleSort(arr1, 0);
        System.out.println("bubbleSort 0 A: " + Arrays.toString(arr1));

        int[] arr2 = {56, 12, 98, 34, 45, 100, 34, 450, 1, 2, 9, 4, 100};
        bubbleSort(arr2, 1);
        System.out.println("bubbleSort 1 D: " + Arrays.toString(arr2));

        System.out.println();

        //Selection
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

    }

    public static void bubbleSort(int[] arr, int order) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Ascending order
                if (order == 0) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

                // Descending order
                if (order == 1) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
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
            int temp = arr[minIndex];
            arr[minIndex] = arr[low];
            arr[low] = temp;
            selectionSort(arr, low+1, high,order);
        }

        // Min Descending order
        if(order == 1){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[high-1];
            arr[high-1] = temp;
            selectionSort(arr, low, high - 1,order);
        }

        // Max Ascending order
        if(order == 2){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[high-1];
            arr[high-1] = temp;
            selectionSort(arr, low, high-1, order);
        }

        // Max Descending order
        if(order == 3){
            for (int i = low + 1; i < high; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[low];
            arr[low] = temp;
            selectionSort(arr, low+1, high, order);
        }
    }
}