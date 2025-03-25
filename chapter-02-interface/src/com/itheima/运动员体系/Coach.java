package com.itheima.运动员体系;

public abstract class Coach extends Person {
    public void eat(){
        System.out.println("吃大肉，喝大酒");
    }

    public abstract void teach();

    public Coach() {
    }

    public Coach(int age, String name) {
        super(age, name);
    }
}
