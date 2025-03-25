package com.itheima.homework;

public class Panda extends Animal{
    public Panda(){
    }

    public Panda(int numberOfLegs, String color) {
        super(numberOfLegs, color);
    }

    @Override
    public void eat() {
        System.out.println(getColor()+"色"+getNumberOfLegs()+"条腿，的大熊猫在吃竹子");
    }

    public void climbTree(){
        System.out.println(getColor()+"色"+getNumberOfLegs()+"条腿，的大熊猫在爬树");
    }
}
