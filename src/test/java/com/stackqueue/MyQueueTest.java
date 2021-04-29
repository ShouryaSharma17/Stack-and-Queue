package com.stackqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    // Test to check if queue is created
    @Test
    public void givenInput_ShouldBeAppendedLast() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);
        Assertions.assertTrue(firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode));
    }
    // Test to check dequeue of elements from beginning
    @Test
    public void givenInput_TailShouldBeMovedBackOneNode(){
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(firstNode);
        myQueue.enqueue(secondNode);
        myQueue.enqueue(thirdNode);
        INode frontNode = myQueue.deQueue();
        Assertions.assertEquals(firstNode, frontNode);
    }
}
