package com.itheima.继承中成员变量不重名的访问方式;

public class Fu {
    int count = 100;

    public void show() {
        System.out.println("hahh");
    }
}

class Zi extends Fu {
    int number = 200;

    @Override
    public void show() {
        System.out.println("特喵的我想回家");
    }
}
