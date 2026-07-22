package LinkedList;

public class A001LinkedList {

    public static class LinkedList{
        private Node head;
        private Node tail;
        private int size;

        // LinkedList Constructor
        public LinkedList(){
            this.size =0;
        }

        // Node class
        private class Node {
            int data;
            Node next;

            // Node Constructors
            public Node(int data) {
                this.data = data;
            }
            public Node (int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        // LinkedList Methods
        public void insertFirst(int data) {
            Node node = new Node(data);
            node.next = head;
            head = node;
            // first element
            if(tail == null){
                tail = head;
            }
            size++;
        }
        public void insertLast(int data) {
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

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);

        list.display();

    }
}
