package com.itheima.list;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //问题：通过list调用remove方法，传递数据默认是通过元素删，还是索引删？
        list.remove(2);
        System.out.println(list);

        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }


}
