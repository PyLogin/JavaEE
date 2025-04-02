package com.itheima.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        /*
        1、迭代器的概念
            - 迭代器是Collection 单例集合体系的通用遍历方式
            - 工作方式：循环
        2、迭代器的使用方法
            (1) 要遍历哪个集合，就通过哪个集合创建一个迭代器对象
            (2) 判断集合是否还有下一个元素
            (3) 输出集合内的内容
        3、迭代器的注意事项
            - 一次hasNext方法搭配一次next()方法使用
            - hasNext()方法和获取元素没有必然联系
            - 在迭代过程中不能对集合进行其他操作

         */
        Collection collection = new ArrayList();
        collection.add("张二毛");
        collection.add("李四狗");
        collection.add("王钢弹");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
