package com.itheima.generic;

import java.util.ArrayList;

public class GenericDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        addElemet(list,"张二狗");

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        addElemet(list2,200);
        System.out.println(list2);
    }


    public static <E> void addElemet(ArrayList<E> list, E e){
        list.add(e);

    }
}
