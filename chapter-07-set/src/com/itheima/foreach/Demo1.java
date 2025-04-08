package com.itheima.foreach;

import com.itheima.entity.Student;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("aaa");
        str.add("bbb");
        str.add("ccc");
        for (String s : str) {
            System.out.println(s);
        }



    }
}
