package StackAndQueues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
public class A001Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(67);

        int num = stack.pop();
        System.out.println("stack            : " + stack);
        System.out.println("stack.getClass() : " + stack.getClass());
        System.out.println("num              : " + num);
        System.out.println("stack.search(23) : " + stack.search(23));
        System.out.println("stack.empty()    : " + stack.empty());
        System.out.println("int.class        : " + int.class);
        System.out.println();
        // Primitive data types (int, double, char, boolean, etc.) are not objects,
        // so they don't have the getClass() method. Use <primitive>.class instead.
    }
}
