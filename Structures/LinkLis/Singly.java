package rick.Structures.LinkLis;

public class Singly {
    private Node head;
    private Node tail;
    private int size;
    public Singly(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value, head);
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertlast(int value){

        if (tail == null){
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        newNode = tail;
        size++;
    }
    public void insert(int val, int ind){
        if(ind >= size){
            try {
                throw  new NodeOutOfBound();
            }catch (Exception e){
                e.printStackTrace();
            }
            return;
        }

        if(ind == 0){
            insertFirst(val);
            return;
        }
        if(ind == size){
            insertlast(val);
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
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }
    public void deleteFirst(){
        if(head == null){
            tail = null;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(size == 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i = 1; i <= size - 2; i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index == size - 1){
            deleteLast();
            return;
        }
        if(index >= size){
            try {
                throw new NodeOutOfBound();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        Node node = getNode(index-1);
        node.next = node.next.next;
        size--;
    }
    public int findByValue(int val){
        Node node = head;
        int res = 0;
        while (node!=null){
            if(node.value == val){
                return res;
            }
            res++;
            node = node.next;
        }
        return -1;
    }
    public int findByIndex(int ind){
        if(ind >= size){
            try {
                throw new NodeOutOfBound();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        Node node = head;
        int res = 0;
        while (res < ind){
            res++;
            node = node.next;
        }
        return node.value;
    }

    private Node getNode(int index){
        Node node = head;
        for(int i= 1; i <= index; i++){
            node = node.next;
        }
        return node;
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
    private class NodeOutOfBound extends Exception{
        NodeOutOfBound(){
            super("Index out of bound for size "+size);
        }
    }
}
