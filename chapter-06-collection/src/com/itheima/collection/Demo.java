package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握collection接口的定义和成员方法

        Collection<String> coll = new ArrayList<String>();

        coll.add("张二狗");
        coll.add("张思茅");

        System.out.println("[coll]" + coll); //ArrayList重写了ToString方法

        /*
        public boolean addAll(Collection<E> coll);

        */





    }
}
