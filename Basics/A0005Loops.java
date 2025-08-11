package Basics;

public class A0005Loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 2; i++){
            System.out.println("For : Prints 2 times");
        }
        System.out.println();

        // while loop
        int i = 0;
        while(i < 2){
            System.out.println("While : Prints 2 times");
            i++;
        }
        System.out.println();

        // do-while loop
        int counter = 0;
        do{
            System.out.println("do-while : prints 2 times");
            counter++;
        }while (counter < 2);
    }
}
