package com.stack;

public class DynamicStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity) {
            expand();
        }
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length=size();
        int[] newStack=new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        capacity *= 2;
    }
    public void pop() {
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        shrink();
    }

    private void shrink() {
        int length =size();
        if(length <= (capacity/2)){
            capacity=capacity/2;

            int[] newStack = new int[capacity];
            System.arraycopy(stack,0,newStack,0,length);
            stack=newStack;
        }
    }

    public int size() {
        return top;
    }
    public void show(){
        for (int n : stack) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
