package com.itheima.多态的宏观体现;

public class Test {
    public static void main(String[] args) {
        // 父类引用指向子类对象

        Animal a = new Dog();

        // 接口引用指向实现类对象
        Smokable s = new JavaTeacher();



    }
}
