package Basics;
import java.util.Arrays;

/* given an array of n elements from range [0,n]. find the missing number.
example: arr = [9,1,2,7,3,6,4,5,0]
8 is missing.

example: arr = [0,1]
2 is missing.
explanation: since there are two numbers
range = [0,2]
 */

public class A0019MissingNumber {
    public static void main(String[] args) {
        int [] arr1 = {9,1,2,7,3,6,0,5,4};
        missingNumber(arr1);

        System.out.println();

        int [] arr2 = {0,1};
        missingNumber(arr2);
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        int correctIndex;
        while (i < arr.length) {
            if(arr[i] == 0) {
                i++;
                continue;
            }
            correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i ++;
            }
        }
    }

    public static void missingNumber(int[] arr) {
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println("This value is missing: " + (i+1) );
            }
        }
    }
}
