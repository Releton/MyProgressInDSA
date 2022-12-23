package rick.Structures.LinkLis;

public class DoublyImplementation
{
    public static void main(String[] args) {
        Doubly list = new Doubly();
        list.insertFirst(5);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(8);

        list.display();

        list.insertLast(150);
        list.insertLast(158);

        list.display();

        list.insert(78, 2);
        list.display();

        list.deleteLast();
        list.display();

        list.deleteFirst();
        list.display();

        list.delete(2);
        list.display();
        list.reverseDisplay();
    }
}
