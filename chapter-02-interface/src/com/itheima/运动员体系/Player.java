package com.itheima.运动员体系;

public abstract class Player extends Person{
    @Override
    public void eat() {
        System.out.println("喝牛奶，吃牛肉");
    }

    public abstract void study();

    public Player() {
        super();
    }

    public Player(int age, String name) {
        super(age, name);
    }
}
