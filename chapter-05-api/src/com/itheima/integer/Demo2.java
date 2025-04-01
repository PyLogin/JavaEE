package com.itheima.integer;

public class Demo2 {
    public static void main(String[] args) {
        // 目标：掌握自动装箱和自动拆箱
        // 自动装箱：当Java发现某个地方需要将基本数据类型转变为包装类之后才可以操作的时候，自动将基本类型的数据装箱为包装类型
        //
        Integer i = 10; // Integer i = Integer.valueOf(10);
        System.out.println(i);
        show(100);

        // 自动拆箱：
        System.out.println(i + 20);
    }

    public static void show(Integer ii) {
        System.out.println(ii);
    }
}
