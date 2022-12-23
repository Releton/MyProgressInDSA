package rick.Structures.LinkLis;

public class ImplementationSingly {
    public static void main(String[] args) {
        Singly list  = new Singly();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertlast(150);
        list.insert(3,2);
        list.display();
        System.out.println("After deleting first...");
//        list.insert(3,699);
        list.deleteFirst();
        list.display();
        System.out.println("After deleting last");
        list.deleteLast();
        list.display();
        list.delete(1);
        System.out.println("After deleting the 1 index");
        list.display();
        System.out.println();
        System.out.println("The index of the value is "+ list.findByValue(5));
        System.out.println("The value at index 1 is "+list.findByIndex(1));
        list.insertlast(11);
        list.display();
    }
}
