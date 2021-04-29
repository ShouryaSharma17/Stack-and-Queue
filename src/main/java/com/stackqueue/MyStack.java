package com.stackqueue;

public class MyStack {
    private MyLinkedList myLinkedList= new MyLinkedList();
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }
    public INode peek() {
        return myLinkedList.head;
    }
}
