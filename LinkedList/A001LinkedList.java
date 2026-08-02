package LinkedList;

public class A001LinkedList {

    public static class LinkedList{
        private Node head;
        private Node tail;
        private int size;

        // LinkedList Constructor
        public LinkedList(){}

        // Node class
        private class Node {
            private int data;
            private Node next;

            // Node Constructors
            public Node(int data) {this.data = data;}
            public Node (int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        // LinkedList Methods
        public void add(int index, int data) {
            if(index < 0 || index > size) return;

            if(index == 0){
                addFirst(data);
                return;
            }

            if(index == size){
                addLast(data);
                return;
            }

            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }

            temp.next = new Node(data, temp.next);
            size++;
        }

        public void addFirst(int data) {
            Node node = new Node(data);
            node.next = head;
            head = node;

            // for first element of list
            if(tail == null){
                tail = head;
            }

            size++;
        }

        public void addLast(int data) {
            Node node = new Node(data);
            if(tail == null){  // empty list
                head = tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }

            size++;
        }

        public void remove(int index) {
            if(index < 0 || index >= size){return;}
            if(index == 0) {
                removeFirst();
                return;
            }
            if(index == size-1){
                removeLast();
                return;
            }

            Node node = head;
            for(int i =0; i < index-1; i++){
                node = node.next;
            }
            Node temp = node.next;
            node.next = temp.next;
            temp.next = null;

            size--;
        }

        public void removeFirst() {
            if (size == 0) return;

            if (size == 1) {
                head = tail = null;
            } else {
                Node node = head;
                head = head.next;
                node.next = null;
            }

            size--;
        }

        public void removeLast() {
            if (size == 0) return;

            if (size == 1) {
                head = tail = null;
            } else {
                Node node = head;
                for (int i = 0; i < size - 2; i++) {
                    node = node.next;
                }
                tail = node;
                node.next = null;
            }

            size--;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    // wrote using gpt ... to check my implementation
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        System.out.println("=== Insert First Test ===");
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.display();   // Expected: 30 --> 20 --> 10 --> null


        System.out.println("\n=== Insert Last Test ===");
        list.addLast(40);
        list.addLast(50);
        list.display();   // Expected: 30 --> 20 --> 10 --> 40 --> 50 --> null


        System.out.println("\n=== Insert at Index Test ===");
        list.add(2, 25);
        list.display();   // Expected: 30 --> 20 --> 25 --> 10 --> 40 --> 50 --> null


        System.out.println("\n=== Delete First Test ===");
        list.removeFirst();
        list.display();   // Expected: 20 --> 25 --> 10 --> 40 --> 50 --> null


        System.out.println("\n=== Delete Last Test ===");
        list.removeLast();
        list.display();   // Expected: 20 --> 25 --> 10 --> 40 --> null


        System.out.println("\n=== Delete Middle Index Test ===");
        list.remove(1);
        list.display();   // Expected: 20 --> 10 --> 40 --> null


        System.out.println("\n=== Delete First Using Index Test ===");
        list.remove(0);
        list.display();   // Expected: 10 --> 40 --> null


        System.out.println("\n=== Delete Last Using Index Test ===");
        list.remove(1);
        list.display();   // Expected: 10 --> null


        System.out.println("\n=== Empty List Test ===");
        list.removeFirst();
        list.display();   // Expected: null


        System.out.println("\n=== Insert After Empty Test ===");
        list.addLast(100);
        list.display();   // Expected: 100 --> null
    }
}
