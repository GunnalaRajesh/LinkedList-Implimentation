package LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(40);
        list.insertAt(100,4);
        list.deleteFirst();
        list.deleteEnd();
        list.deleteAt(0);
        list.getEleAt(0);
        list.clearAll();
        list.display_data();
    }
}
