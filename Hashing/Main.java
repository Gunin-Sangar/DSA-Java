package Hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // trying to implement separate chaining
        int[] arr = new int[] {2,7,11,12,15};
        ArrayList<Integer>[] table = new ArrayList[10];

        // creating buckets -> important as all initial values are null
        for(int i = 0; i < table.length; i++){
            table[i] = new ArrayList<>();
        }

        for(int n : arr){
            int index = hashFn(n);
            table[index].add(n);
        }

        System.out.println("index with values: ");
        for(int i=0;i<table.length;i++){
            for(int j =0;j<table[i].size();j++){
                System.out.println((i + "," + j));
            }
        }

        System.out.println();

        System.out.println("value: ");
        for(int i = 0; i < table.length; i++){
            System.out.println(i + " -> " + table[i]);
        }
    }

    public static int hashFn(int num){
        return num%10;
    }
}
