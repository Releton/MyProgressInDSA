package rick.Structures.LinkLis;

public class Doubly {
    private Node head, tail;
    private int size = 0;
    public void insertFirst(int val){
        Node node  = new Node(val);
        if(head == null){
            head = node;
            tail = head;
            size++;
            return;
        }
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;

        size++;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insert(int val, int ind){
        if(ind == 0){
            insertFirst(val);
            return;
        }
        if(ind == size-1){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 1;i < ind; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        node.next.prev = temp;
        temp.next = node;
        node.prev = temp;
        size++;
    }
    public void delete(int ind){
        Node temp = head;
        for(int i = 1; i < ind; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;

        size--;
    }
    public void reverseDisplay(){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
    }
    public void deleteFirst(){
        if (head == null)return;
        head = head.next;
        head.prev = null;
        size--;
    }
    public void deleteLast(){
        if(tail==null)return;
        tail = tail.prev;
        tail.next = null;
        size--;
    }


    public class Node{
        private Node next, prev;
        private int val;
        public Node(Node prev) {
            this.prev = prev;
        }

        public Node(Node next, Node prev) {
            this.next = next;
            this.prev = prev;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }

        public Node(int val){
            this.val = val;
        }
    }
}
