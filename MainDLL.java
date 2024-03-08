package LinkedList;

public class MainDLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(9);
        for(int i=10;i<16;i++){
            list.insertLast(i);
        }
//        list.clearAll();
        list.insertAt(101,7);
        list.deleteFirst();
        list.deleteLast();
        list.deleteAt(5);
//        list.getFirst();
//        list.getLast();
        list.getAt(4);
        list.display();
    }
}
