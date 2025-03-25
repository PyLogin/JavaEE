package com.itheima.homework;

public class PolarBear extends Animal{
    public PolarBear(int numberOfLegs, String color) {
        super(numberOfLegs, color);
    }

    public PolarBear() {
    }

    @Override
    public void eat() {
        System.out.println(getColor()+"色"+getNumberOfLegs()+"条腿，的北极熊在吃蜂蜜");
    }

    public void catchFish(){
        System.out.println(getColor()+"色"+getNumberOfLegs()+"条腿，的北极熊在抓鱼");
    }
}
