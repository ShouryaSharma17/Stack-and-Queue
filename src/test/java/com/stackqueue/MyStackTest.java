package com.stackqueue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Stack;
public class MyStackTest {
    // Test to verify if the stack is created
    @Test
    public void givenInput_WhenAdded_ShouldPassTest() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);
        MyStack myStack= new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        INode peek = myStack.peek();
        Assertions.assertEquals(thirdNode, peek);
    }
    // Test to verify if the list is empty
    @Test
    public void givenInput_WhenPopped_ShouldPassTest() {
        MyNode<Integer> firstNode = new MyNode(70);
        MyNode<Integer> secondNode = new MyNode(30);
        MyNode<Integer> thirdNode = new MyNode(56);
        MyStack myStack= new MyStack();
        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        INode removedNode = myStack.pop();
        Assertions.assertEquals(thirdNode, removedNode);
    }
}
