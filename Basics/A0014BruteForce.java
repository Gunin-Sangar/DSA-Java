package Basics;

public class A0014BruteForce {
    public static void main(String[] args) {

        // Array declaration and initialisation
        System.out.println("-- Max Sub-array Sum using Brute Force --");
        int[] arr = {45, 65, -95, 243, 34, -26, 128};

        // calling the brute-force method
        int result = maxSumSubArrays(arr);

        // printing the result
        System.out.println("Maximum Sub-array Sum : " + result);
    }

    // maxSumSubArrays() : int
    // returns the maximum sum of all possible sub-arrays
    public static int maxSumSubArrays(int[] arr) {
        int start;          // start index of the sub-array
        int end;            // end index of the sub-array
        int currSum;
        int maxSum = 0;

        // iterating array -- get start index
        for (int i = 0; i < arr.length; i++) {
            start = i;

            // iterating array --> get end index
            for (int j = i; j < arr.length; j++) {
                end = j;
                // resetting current sum for next iteration
                currSum = 0;

                // calculating sum from start to end index
                for (int k = start; k <= end; k++) {
                    currSum = currSum + arr[k];
                }

                // printing current sum
                System.out.println("currSum : " + currSum);

                // checking if current sum is greater than max sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        // returning the largest sum found
        return maxSum;
    }
}

/*
==================== MAX SUB-ARRAY SUM (BRUTE FORCE) ====================
    -- Definition --
    The maximum sub-array sum problem finds the largest sum of
    any contiguous sub-array in the array.

    -- Approach --
        1. Pick a starting index `i`.
        2. Pick an ending index `j`.
        3. Sum up all elements between `i` and `j`.
        4. Compare the sum with the maximum sum found so far.
        5. Repeat for all sub-arrays.

    -- Time Complexity --
        Outer loop (i): n iterations
        Middle loop (j): n iterations
        Inner loop (k): n iterations
        Overall: O(n³) → very slow for large arrays.

    -- Space Complexity --
        O(1) → uses constant extra space.

    -- Example --
        Input: [45, 65, -95, 243, 34, -26, 128]
        Output: 379
        Explanation: The sub-array [243, 34, -26, 128] gives the max sum.

    -- Optimized Approach --
        Kadane's Algorithm can solve this in O(n) time.
*/
