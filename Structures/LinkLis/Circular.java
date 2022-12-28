package rick.Structures.LinkLis;

public class Circular {
    private Node head, tail;
    private int size = 0;

    public void insertLast(int val){
        Node node = new Node(val);
        if(head ==null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = head;
            tail.next = head;
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        head = node;
    }
    public void insert(int val, int ind){

        if(ind == 0){
            insertFirst(val);
            return;
        }
        if(ind == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < ind; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }
    public void display(){
        Node temp = head;
        if(head == null)return;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while (temp != head);
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node node){
            this.value = value;
            this.next = node;
        }
    }
}
