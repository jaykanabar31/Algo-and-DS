package LinkedList;

public class Solution {

    public static void main(String[] args){

        LinkedNode ll = new LinkedNode();

        ll.addToFront(1);
        ll.addToFront(2);
        ll.addToFront(3);



       ll.removeFromFront();
        ll.removeFromFront();
        ll.removeFromFront();
        ll.removeFromFront();

        ll.printList();
    }
}
