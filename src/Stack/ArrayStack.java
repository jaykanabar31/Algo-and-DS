package Stack;

import java.util.EmptyStackException;

public class ArrayStack {

    private int[] elementsStack;
    private int top;

    public ArrayStack(int capacity){
        elementsStack = new int[capacity];
    }

    public void push(int element){

        if(top == elementsStack.length){
            int[] newStack = new int[2 * elementsStack.length];
            System.arraycopy(elementsStack, 0, newStack, 0, elementsStack.length);
            elementsStack = newStack;
        }

        elementsStack[top++] = element;
    }

    public int pop(){

        if(isEmpty())
            throw new EmptyStackException();

        int data = elementsStack[--top];
        return data;
    }

    public boolean isEmpty() {
        return 0 == top;
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();

        int data = elementsStack[top - 1];
        return data;
    }

    public void printStack(){
        for(int element : elementsStack){
            System.out.println(element);
        }
    }

}
