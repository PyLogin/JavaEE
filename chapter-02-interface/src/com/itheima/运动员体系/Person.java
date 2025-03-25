package com.itheima.运动员体系;

public abstract class Person {
    // 定义私有成员变量
    private String name;
    private int age;

    // 定义有参/无参构造方法
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // 提供GET/SET方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // 提供抽象eat方法
    public abstract void eat();
}
