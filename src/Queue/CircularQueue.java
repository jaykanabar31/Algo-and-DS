package Queue;

public class CircularQueue {


    private int[] queue;
    private int front;
    private int back;

    public CircularQueue(int capacity){
        queue = new int[capacity];
    }

    public void add(int value){
        if(size() == queue.length - 1){
            int backIndex = size();
            int[] newArray = new int[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;
            front = 0;
            back = backIndex;
        }

        queue[back] = value;

        if(back < queue.length - 1)
            back++;
        else
            back = 0;
    }

    public int remove(){
        if(size() == 0)
            return -1;
        int deleted = queue[front++];

        if(size() == 0){
            front = 0;
            back = 0;
        }
        else if(front == queue.length)
            front = 0;

        return deleted;
    }

    public int peek(){
        if(size() == 0)
            return -1;

        return queue[front];
    }

    public int size(){
        if(front <= back)
            return back - front;

        return (back - front) + queue.length;
    }

    public void printQueue(){

        if(front <= back) {
            for (int val = front; val < back; val++) {
                System.out.println(queue[val]);
            }
        }
        else{
            for (int val = front; val < queue.length; val++) {
                System.out.println(queue[val]);
            }

            for (int val = 0; val < back; val++) {
                System.out.println(queue[val]);
            }
        }
    }

}
