package com.itheima.integer;

public class Demo1 {
    public static void main(String[] args) {
        // 目标：掌握装箱和拆箱的概念和目的
        int i = 10;
        Integer ii = new Integer(i);
        Integer iii = Integer.valueOf(i);

        int iiii = ii.intValue();
        System.out.println(iiii);
    }
}
