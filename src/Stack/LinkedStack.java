package Stack;

public class LinkedStack {

    private class Node{
        char data;
        Node link;
    }

    Node top;

    public LinkedStack(){
        top = null;
    }

    public void push(char data){
        Node temp = new Node();
        temp.data = data;

        if(isEmpty())
            top = temp;

        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return null == top;
    }

    public char pop(){
        if(isEmpty())
            return Character.MIN_VALUE;

        char delData = top.data;
        top = top.link;

        return delData;
    }

    public char peek(){
        if(isEmpty())
            return Character.MIN_VALUE;

        return top.data;
    }
}
