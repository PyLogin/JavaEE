package com.itheima.entity;

public class Test {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        final Student student1 = new Student("zhangsan", 22);
        student1.setAge(23);
        System.out.println(student1);

    }


}
