package com.stackqueue;

public interface INode<K>{
    K getKey();
    public void setKey(K key);

    INode getNext();
    void setNext(INode next);
}

