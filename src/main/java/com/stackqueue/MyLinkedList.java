package com.stackqueue;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public void MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    // Add elements
    public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    // Delete elements
    public INode pop() {
        INode tempNode=this.head;
        this.head=head.getNext();
        return tempNode;
    }
    // Appending elements
    public void append( INode newNode) {
        if (this.tail== null){
            this.tail = newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
}
