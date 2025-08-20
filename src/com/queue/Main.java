package com.queue;

public class Main {
    public static void main(String[] args) {
        Queue q=new Queue();

        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);

        q.deQueue();
        q.deQueue();

        q.enQueue(25);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(45);



       System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.show();


    }
}
