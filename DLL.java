package LinkedList;
//creating DoublyLinkedList starts Here
public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        int size = 0;
    }
//creating a node in which "next" and "prev" both to be included with data for each Node
    public class Node{
        private Node next;
        private Node prev;
        private int data;

        public Node(int data) {
            this.data = data;
        }
    }


    public void insertFirst(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = head.prev;
        }
        size++;

    }


    public void insertLast(int data){
        Node temp = new Node(data);
        if(head == null){
            insertFirst(data);
        }
        else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
            temp.prev = curr;
            tail = temp;
        }
        size++;
    }


    public void insertAt(int data, int index){
        if(index<0 || index > size){
            System.out.println("Index Out Of Bound");
        }
        else{
            if(index == 0){
                insertFirst(data);
            }
            if(index == size){
                insertLast(data);
            }
            else{
                Node temp = new Node(data);
                Node curr = head;
                Node prevs = null;
                while(index-- != 0){
                    prevs = curr;
                    curr = curr.next;
                }
                prevs.next = temp;
                temp.prev = prevs;
                temp.next = curr;
                curr.prev = temp;
                size++;
            }
        }
    }


    public void deleteFirst(){
        if(head != null){
            head = head.next;
            size--;
        }
        else{
            System.out.println("List is already empty");
        }
    }


    public void deleteLast(){
        if(head != null){
            if(head == tail){
                clearAll();
            }
            else{
                Node beforeElement = null;
                Node curr = head;
                while(curr.next != null){
                    beforeElement = curr;
                    curr = curr.next;
                }
                beforeElement.next = null;
                tail = beforeElement;
                size--;
            }
        }
        else{
            deleteFirst();
        }
    }


    public void deleteAt(int index){
        if(index < 0 || index>size){
            System.out.println("index out of Bound");
        }
        if(index == 0){
            deleteFirst();
        }
        else if(index == size-1){
            deleteLast();
        }
        else{
            Node curr = head;
            Node beforeElement = null;
            while(index-- != 0){
                beforeElement = curr;
                curr = curr.next;
            }
            curr = curr.next;
            beforeElement.next = curr;
            curr.prev = beforeElement;
            size--;
        }
    }


    public void getFirst(){
        System.out.println(head.data);
    }


    public void getLast(){
        System.out.println(tail.data);
    }


    public void getAt(int index){
        if(index < 0 || index >= size){
            System.out.println("index out of bound");
        }
        else if(index == 0){
            getFirst();
        }
        else if(index == size-1){
            getLast();
        }
        else{
            Node curr = head;
            while(index-- != 0){
                curr = curr.next;
            }
            System.out.println(curr.data);
        }

    }


    public void display(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


    public void clearAll(){
        head = null;
        tail = null;
        size = 0;
    }
}
