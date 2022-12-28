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
    public void display() {
        Node temp = head;
        while (temp != null) {
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
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index -1, node.next);
        return node;
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
    //question 83
    public void duplicateRemoval(){
        Node temp = head;
        while (temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            }
            else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    //question 21
    public Singly mergeTwoSorted(Node a, Node b){
        Singly res = new Singly();
        res.head = a.value > b.value ? b : a;
        while (a != null && b != null){
            if(a.value < b.value){
                res.insertlast(a.value);
                a = a. next;
            }
            else{
                res.insertlast(b.value);
                b = b.next;
            }
        }
        while (a != null){
            res.insertlast(a.value);
            a = a.next;
        }
        while (b != null){
            res.insertlast(b.value);
            b = b.next;
        }
        return res;
    }

    //question 141
    public boolean hasCycle(Node head) {
        Node f = head, s = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                return true;
            }

        }
        return false;
    }
    //question 202

    public boolean isHappy(int n) {
        int s = n, f = n;
        do{
            s = findSquare(s);
            f = findSquare(findSquare(f));
        }while(s != f);

        if(s == 1){
            return true;
        }
        return false;
    }

    public int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    //question 868
    public Node middleNode(Node head) {
        Node s = head, f = head;
        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Singly list = new Singly();
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(4);
        list.insertlast(4);
        list.insertlast(5);
        list.duplicateRemoval();
        list.display();
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
