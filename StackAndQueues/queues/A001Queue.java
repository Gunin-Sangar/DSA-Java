package StackAndQueues.queues;

import java.util.LinkedList;
import java.util.Queue;

public class A001Queue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(23);
        queue.add(34);
        queue.add(45);
        queue.add(56);
        queue.add(67);

        int qnum = queue.remove();
        System.out.println("queue            : " + queue);
        System.out.println("queue.getClass() : " + queue.getClass());
        System.out.println("qnum              : " + qnum);
        System.out.println("int.class        : " + int.class);
    }
}
