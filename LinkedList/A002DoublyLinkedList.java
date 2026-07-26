package LinkedList;

public class A002DoublyLinkedList {

    public static class DoublyLinkedList {
        // DoublyLinkedList properties
        private Node head;
        private Node tail;
        private int size;

        // Not required constructor but i will
        public DoublyLinkedList(){}

        // Node Class
        public class Node{
            private int data;
            private Node next;
            private Node prev;

            // Node Constructor
            Node(int data){
                this(data,null,null);
            }
            Node(int data, Node next, Node prev){
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
        }

        public void insert(int data, int index) {
            if(index < 0 || index > size){return;}
            if(index == 0){insertFirst(data);return;}
            if(index == size){insertLast(data);return;}

            // temp is taken just behind node using head
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }

            // node is the one to be inserted
            Node node = new Node(data, temp.next, temp);

            temp.next.prev = node;
            temp.next = node;

            size++;
        }

        public void insertFirst(int data){
            // if empty list
            if(tail == null){
            Node node = new Node(data);
                head = tail = node;
            }else {
                Node node = new Node(data, head, null);
                head.prev = node;
                head = node;
            }
            size++;
        }

        public void insertLast(int data){
            // empty list
            if(tail == null){
                Node node = new Node(data);
                head = tail = node;
            }else{
                Node node = new Node(data,null,tail);
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void delete(int index){
            if(index < 0 || index >= size){return;}
            if(index == 0){deleteFirst();return;}
            if(index == size-1){deleteLast();return;}

            // For optimised traversal
            Node temp;
            if(index < size/2){
                temp=head;
                for(int i=0;i<index;i++){
                    temp=temp.next;
                }
            }
            else{
                temp=tail;
                for(int i=size-1;i>index;i--){
                    temp=temp.prev;
                }
            }

//            Node ahead = temp.next;
//            Node behind = temp.prev;
//            behind.next = temp.next;
//            ahead.prev = temp.prev;
//            Same as below 2 lines ... optimized ? Yes

            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            temp.next = null;
            temp.prev = null;
            size--;
        }

        public void deleteFirst(){
            if(tail == null){
                return;
            }
            if(size == 1){
                head = tail = null;
            }else{
//              This also works  [like in list A <-> B <-> C] [A would become unreachable and hence still collected by GC]
                head = head.next;
                head.prev = null;

//                Node temp = head;
//                temp = temp.next;
//                head.next = null;
//                temp.prev = null;
//                head = temp;
            }
            size--;
        }

        public void deleteLast(){
            if(tail == null){
                return;
            }
            if(size == 1){
                head = tail = null;
            }else{
                Node temp = tail;
                temp = temp.prev;
                tail.prev = null;
                temp.next = null;
                tail = temp;
            }
            size--;
        }

        public void displayForward(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        public void displayBackward(){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.data + " <-> ");
                temp = temp.prev;
            }
            System.out.println("START");
        }

        public int getSize(){
            return size;
        }

    }



    public static void main(String[] args){

        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Insert First:");
        list.insertFirst(20);
        list.insertFirst(10);
        list.displayForward();
        list.displayBackward();


        System.out.println("\nInsert Last:");
        list.insertLast(30);
        list.insertLast(40);
        list.displayForward();
        list.displayBackward();


        System.out.println("\nInsert at Index:");
        list.insert(25, 2);  // 10 <-> 20 <-> 25 <-> 30 <-> 40
        list.displayForward();
        list.displayBackward();


        System.out.println("\nDelete First:");
        list.deleteFirst();
        list.displayForward();
        list.displayBackward();


        System.out.println("\nDelete Last:");
        list.deleteLast();
        list.displayForward();
        list.displayBackward();


        System.out.println("\nDelete at Index:");
        list.delete(1);  // remove 25
        list.displayForward();
        list.displayBackward();


        System.out.println("\nInsert at Beginning Again:");
        list.insert(5,0);
        list.displayForward();
        list.displayBackward();


        System.out.println("\nInsert at End Again:");
        list.insert(50,list.getSize());
        list.displayForward();
        list.displayBackward();
    }

}