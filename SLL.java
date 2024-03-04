package LinkedList;

public class SLL {  // creating the formation of LinkedList chains with the help of Head for SLL
    private Node head;  // head of type Node with everytime an element is added the size need to be increased
    private int size;

    public SLL() { // constructor for the operations of size
        this.size = 0;
    }
    public static class Node{  // Node class provides you the data and the address of the next node.

        private final int data;
        private Node next;
//PolyMorphic holding of the data. here assigns the value into the node and next will be null. when a next is accessed to point to
//        other Node at creating data Node then automatically it calls (data,next) directly
        public Node(int data) {
            this.data = data;
        }
    }

//   SLL operations
//    Insert and Element at first
//    create a data node. Now make node.next to head.
//    according to the properties of LinkedList a head always to be at starting of the list so change node to head;
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next=head;
        head = node;
        size++;
    }

//    Insert at Last;
//    point curr to head then move till null now create a data node and point curr.next to node
    public void insertLast(int data){
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new Node(data);
        size++;
    }

//    insert at the given index
//    move current forward by storing the curr in prev variable and decrement index, till index == 0 so this is the position we need to insert an element
//    now create a data node and make prev.next to node then move forward and prevnext = current;
    public void insertAt(int data,int index){
        if(index <0 || index > size){
            return;
        }
        if(index == 0){
            this.insertFirst(data);
        }
        else if(index == size){
            this.insertLast(data);
        }
        else{
            Node curr = head;
            Node prev = null;
            while(index != 0){
                prev = curr;
                curr = curr.next;
                index--;
            }
            prev.next = new Node(data);
            prev = prev.next;
            prev.next = curr;
            size++;
        }
    }
//    just point head from 2nd element
    public void deleteFirst(){
        head = head.next;
        size--;
    }

// go till endpoint and make last element to null
    public void deleteEnd(){
        Node node = this.head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
        this.size--;
    }
// move till the index value and make that Node point to next element by skipping the index node;
    public void deleteAt(int index){
        if (index > 0 && index > size) {
            return;
        }
        Node current = head;
        Node previous = null;
        if (index == 0) {
            this.deleteFirst();
        }
        else {
            while (index-- != 0) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
    }
// go till the index and print the curr.data;
    public void getEleAt(int index){
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node node = head;
            for(int i=0;i<index;i++){
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

//    just make head to null and size to 0;
    public void clearAll(){
        this.head = null;
        this.size = 0;
    }
// every time you move forward till null jus print the data of each Node 
    public void display_data(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

}
