package Basics;

public class A0016TrappingRainwater {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,6};
        int areaOfWater = 0;
        int left;
        int right;
        int waterLevel;
        for (int i = 0; i < arr.length; i++) {
            left = leftIndex(arr, i);
            right = rightIndex(arr, i);
            waterLevel = Math.min(arr[left], arr[right]);
            areaOfWater += waterLevel - arr[i];
        }

        System.out.println(areaOfWater);
    }

    public static int leftIndex (int[] arr, int forIndex){
        for (int i = forIndex-1; i > -1; i--) {
            if (arr[forIndex] < arr[i]){
                forIndex = i;
            }
        }
        return forIndex;
    }

    public static int rightIndex (int[] arr, int forIndex){
        for (int i = forIndex+1; i < arr.length; i++) {
            if (arr[forIndex] < arr[i]){
                forIndex = i;
            }
        }
        return forIndex;
    }
}