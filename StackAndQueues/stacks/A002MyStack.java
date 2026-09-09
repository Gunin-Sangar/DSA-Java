package StackAndQueues.stacks;

public class A002MyStack {

    public class MyStack {
        private int[] arr;
        private int capacity;
        private int top = -1;

        // Constructor
        public MyStack(int cap) {
            arr = new int[cap];
            capacity = cap;
        }

        public  void push(int x){
            if (top >= capacity - 1){
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i <= top; i++) {
                sb.append(arr[i]);
                if (i != top)
                    sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }


}