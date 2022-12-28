package rick.Structures.LinkLis;

public class CircularImplementation {
    public static void main(String[] args) {
        Circular list = new Circular();

        list.insertLast(5);
        list.insertLast(8);
        list.insertLast(2);

        list.insertFirst(18);
        list.insert(122,1);
        list.display();
    }
}
