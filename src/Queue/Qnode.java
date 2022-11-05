package Queue;

//Linked list for queue
public class Qnode {

    int key;
    Qnode next;

    public Qnode(int key){
        this.key = key;
        next = null;
    }
}

//Class to represent linked list queue
class Queue {

    //For fifo front and rear
    Qnode front, rear;

    public Queue() {
        front = rear = null;
    }

    public void enqueue(int data){
        Qnode temp = new Qnode(data);

        if(null == rear){
            front = rear = temp;
            return;
        }

        rear.next = temp;
        rear = temp;
    }

    public int dequeue(){

        if(null == front)
            return -1;

        int del = front.key;
        front = front.next;

        if(null == front)
            rear = null;

        return del;
    }

}
