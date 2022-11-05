package LinkedList;

public class Node {

    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

}

class LinkedNode {

    Node head;
    int size;

    public void addToFront(int value){
        Node add = new Node(value);
        add.next = head;
        head = add;
        size++;
    }

    public boolean isEmpty(){
        return null == head;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int removeFromFront(){

        if(isEmpty())
            return -1;

        int removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }
}
