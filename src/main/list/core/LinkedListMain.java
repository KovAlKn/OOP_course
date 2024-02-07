package main.list.core;

import main.list.core.lists.AKLinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        AKLinkedList<Integer> list= new AKLinkedList<>();
        list.addFirst(1);
        System.out.println("длина:" +list.size());

        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("длина:" + list.size());
        System.out.println(list.get(2));
    }
}
