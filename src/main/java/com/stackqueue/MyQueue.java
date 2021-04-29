package com.stackqueue;

public class MyQueue<K> {
    MyLinkedList myLinkedList= new MyLinkedList();
    public void enqueue( INode newNode){
        myLinkedList.append(newNode);
    }
    public void enQueue(INode newNode) {
        myLinkedList.append(newNode);
    }
    public void printQueue() {
        myLinkedList.print();
    }
    public INode deQueue(){
        return myLinkedList.pop();
    }
}
