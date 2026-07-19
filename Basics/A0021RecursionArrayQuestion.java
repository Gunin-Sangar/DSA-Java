package Basics;

import java.util.ArrayList;

class A0021RecursionArrayQuestion {
    public static void main(String[] args) {
        int[] arr = {3,2,9,9,3,1,18,9};
        System.out.println("Target index find 9 : " + find(arr, 9, 0));
        System.out.println("Target index find 3 : " + find(arr, 3, 0));
        System.out.println();

        System.out.println("Target index findLast 9 : " + findLast(arr, 9, arr.length-1));
        System.out.println("Target index findLast 3 : " + findLast(arr, 3, arr.length-1));
        System.out.println();

        System.out.println("Target index findAll 9 : " + findAll(arr, 9, 0,new ArrayList<>()));
        System.out.println("Target index findAll 3 : " + findAll(arr, 3, 0,new ArrayList<>()));
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Target index findAllWithoutArg : " + findAllWithoutArg(arr, 9, 0));
        System.out.println("Target index findAllWithoutArg : " + findAllWithoutArg(arr, 3, 0));
        System.out.println();
    }

    public static int find(int[] arr, int target, int index ){
        if(index >= arr.length){return -1;}
        if(arr[index] == target){return index;}
        return find(arr, target, index + 1);
    }

    public static int findLast(int[] arr, int target, int high){
        if(high < 0){return -1;}
        if(arr[high] == target){return high;}
        return findLast(arr, target, high - 1);
    }

    public static ArrayList<Integer> findAll(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){return list;}
        if(arr[index] == target){list.add(index);}
        return findAll(arr, target, index + 1, list);
    }

    public static ArrayList<Integer>  findAllWithoutArg(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){return list;}
        if(arr[index] == target){list.add(index);}
        ArrayList<Integer> ansFromBelowFnCalls = findAllWithoutArg(arr, target, index + 1);
        list.addAll(ansFromBelowFnCalls);
        return list;
    }
}
