package Basics;

public class A0020StringAndStringBuilder {
    public static void main(String[] args){
        // this points to same object [heap memory]
        String name1 = "Clash of clans";
        String name2 = "Clash of clans";
        String name3 = new String("Clash of clans");

        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name2 == name3: " + (name2 == name3));
        // To compare values of the strings use the .equal method
        System.out.println("name2.equals(name3): " + name2.equals(name3));
        System.out.println();

        System.out.println("name1: " + System.identityHashCode(name1));
        System.out.println("name2: " + System.identityHashCode(name2));
        System.out.println("name3: " + System.identityHashCode(name3));
        System.out.println();

    }


}
