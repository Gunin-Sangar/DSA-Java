package Basics;

public class A0015PrefixSum {
    public static void main(String[] args) {

        // Array declaration and initialization
        System.out.println("-- Max Sub-array Sum using Prefix Sum --");
        int[] arr = {45, 65, -95, 243, 34, -26, 128};

        // calling the brute-force method
        int result = maxSumSubArrays(arr);

        // printing the result
        System.out.println("Maximum Sub-array Sum : " + result);
    }

    // maxSumSubArrays() : int
    public static int maxSumSubArrays(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;
        int[] prefix = new int[arr.length];
        
        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++)  {
            prefix[i] = prefix[i-1] + arr[i];
        }

        // iterating array -- get start index
        for (int i = 0; i < arr.length; i++) {
            // iterating array --> get end index
            for (int j = i; j < arr.length; j++) {
                prefixSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                // printing current sum
                System.out.println("prefixSum : " + prefixSum);
                // checking if current sum is greater than max sum
                if (prefixSum > maxSum) {
                    maxSum = prefixSum;
                }
            }
        }

        // returning the largest sum found
        return maxSum;
    }
}