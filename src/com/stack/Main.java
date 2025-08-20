package com.stack;

public class Main {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(5);
        s.push(8);
        s.push(12);

        s.pop();

        System.out.println(s.peek());

        System.out.println( "Size is: "+s.size());

        System.out.println( s.isEmpty());
       s.show();
       System.out.println();
      System.out.println("************* DynamicStack *************");
       DynamicStack ds=new DynamicStack();

       ds.push(1);
       ds.show();
       ds.push(3);
       ds.show();
       ds.push(5);
       ds.show();
       ds.push(7);
       ds.show();
       ds.push(9);
       ds.show();
       ds.push(11);
       ds.show();

       ds.pop();
       ds.show();

        ds.pop();
        ds.show();

        ds.pop();
        ds.show();

        ds.pop();
        ds.show();

        ds.pop();
        ds.show();
    }
}
