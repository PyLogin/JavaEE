package com.itheima.linkedlist;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("孙悟空");
        linkedList.add("猪刚鬣");
        linkedList.add("唐三藏");

        linkedList.addLast("沙悟净");
        System.out.println("[likedlist]:"+ linkedList);


        linkedList.addFirst("观音菩萨");
        System.out.println("[likedlist]:"+ linkedList);

        System.out.println("[FirstName]"+linkedList.getFirst());

        System.out.println("[LastName]"+linkedList.getLast());


        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

    }
}
