package com.linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data){
        Node node= new Node(data,null);

        if(head == null){
            head=node;
        }
        else {
            Node n=head;
            while (n.next != null){
                n=n.next;
            }
            n.next=node;

        }
    }
    public void insertAtStart(int data){
        Node node=new Node( data , null);
         node.next=head;
         head=node;
    }
    public void insertAt(int index , int data) {
        Node node = new Node(data, null);
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }
    public void deleteAt(int index){
        if(index==0){
            head =head.next;
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            Node n1=n.next;
            n.next=n1.next;
        }
    }

    public void show(){
        Node n=head;
        while(n.next != null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data+" ");
    }
}
