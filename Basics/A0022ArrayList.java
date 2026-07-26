package Basics;

import java.util.ArrayList;

public class A0022ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(12);
        AL.add(23);
        AL.add(34);
        AL.add(45);
        AL.add(56);
        AL.add(67);

        Integer num = AL.remove(5);
        System.out.println("ArrayList            : " + AL);
        System.out.println("ArrayList.getClass() : " + AL.getClass());
        System.out.println("num                  : " + num);
        System.out.println("num.getClass()       : " + num.getClass());
    }
}
