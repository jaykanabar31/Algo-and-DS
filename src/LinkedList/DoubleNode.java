package LinkedList;

public class DoubleNode {

    int data;
    DoubleNode next;
    DoubleNode previous;

    public DoubleNode(int data){
        this.data = data;
    }
}

class DLinkedNode {

    DoubleNode head;
    DoubleNode tail;
    int size;

    public void addToFront(int value){
        DoubleNode add = new DoubleNode(value);

        if(null == head)
            tail = add;
        else {
            add.next = head;
            head.previous = add;
        }
        head = add;
        size++;
    }

    public void addToEnd(int value){
        DoubleNode add = new DoubleNode(value);


        if(null == tail)
            head = add;
        else {
            add.previous = tail;
            tail.next = add;
        }

        tail = add;
        size++;
    }

    public boolean isEmpty(){
        return null == head;
    }

    public int getSize(){
        return size;
    }

    public void printList(){
        DoubleNode current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int removeFromFront(){

        if(isEmpty())
            return -1;

        int removedData = head.data;

        if(tail.next == null)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
        size--;
        return removedData;
    }

    public int removeFromEnd(){

        if(isEmpty())
            return -1;

        int removedData = tail.data;

        if(head.previous == null)
            tail = null;
        else
            head.next.previous = null;

        head = head.next;
        size--;
        return removedData;
    }
}
