package Queue;

public class ArrayQueue {

    private int[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new int[capacity];
    }

    public void add(int value){
        if(back == queue.length){
            int[] newArray = new int[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back++] = value;
    }

    public int remove(){
        if(size() == 0)
            return -1;
        int deleted = queue[front++];

        if(size() == 0){
            front = 0;
            back = 0;
        }

        return deleted;
    }

    public int peek(){
        if(size() == 0)
            return -1;

        return queue[front];
    }

    public int size(){
        return back - front;
    }

    public void printQueue(){
        for(int val = front; val < back ; val++){
            System.out.println(queue[val]);
        }
    }

}
