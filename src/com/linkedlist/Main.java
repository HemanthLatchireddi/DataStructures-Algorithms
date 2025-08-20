package com.linkedlist;

public class Main {
    public static void main(String[] args) {
         LinkedList list=new LinkedList();
         list.insert(5);
         list.insert(12);
         list.insert(18);

         list.insertAtStart(20);

         list.insertAt(0,10);

         list.deleteAt(3);

         list.show();
    }
}
