package com.itheima.运动员体系;

public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("喝牛奶，吃牛肉");
    }

    public void study() {}
}
