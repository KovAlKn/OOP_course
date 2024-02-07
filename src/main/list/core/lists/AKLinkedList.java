package main.list.core.lists;


import main.list.core.GBList;

import java.util.Iterator;

public class AKLinkedList<T> implements GBList{
    private Node<T> head;
    private Node<T> tail;
    private int size=0;

    private static class Node<T>{
        T value;
        Node<T> next;
        Node<T> previous;

        @Override
        public String toString() {
            return "value=" + value;
        }

        public Node(T value, Node<T> next, Node<T> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

           public AKLinkedList() {
    }

    public void addFirst(T t) {
        Node<T> h=head;
        Node<T> newNode = new Node<>(t, head,null);
        head=newNode;
        if (h == null){
            tail=newNode;
        }
        else{
            h.previous= newNode;
        }
         size++;
    }

    public void addLast(T t) {
        Node<T> tl=tail;
        Node<T> newNode = new Node<>(t, null,tail);
        tail=newNode;
        if(tl==null){
            head=newNode;
        }
        else{
            tl.next=newNode;
        }
        size++;
    }

    @Override
    public void add(Object elem) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index) {
        int ind =0;
        Node<T> node = head;
        while(ind<index){
            node=node.next;
            ind++;
        }
        return node.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
