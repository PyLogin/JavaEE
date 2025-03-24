package com.itheima.继承中成员变量不重名的访问方式;

public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.count);
        System.out.println(zi.number);
        zi.show();
    }
}