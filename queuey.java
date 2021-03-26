package com.queueandstack;

import java.util.LinkedList;

public class Queuey {

    LinkedList<Integer> queue;

    //making a queue instance...
    public Queuey() {
        queue = new LinkedList<>();
    }
    //check if queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    //check the size of the queue
    public int size() { 
        return queue.size();
    }

    //Add an element to the queue
    public void enqueue(int data){
        queue.addLast(data);
    }

    //dequeue an element from the queue
    public int dequeue(){
        return((int)queue.remove(0));
    }

    //Peek at the first element in the queue
    public int peek(int n){
        return ((int)queue.get(n));
    }
    public static void main(String[] args) {
        Queuey q = new Queuey();
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        System.out.println(q.peek(2));
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
