package com.itheima.Java中的关系;

public class Dog  extends Animal implements Swimable,Eatable {
    @Override
    public void eat(String food) {
        System.out.println("狗吃"+food);
    }

    @Override
    public void swim() {
        System.out.println("快速游泳中，俗称狗刨");

    }
}
