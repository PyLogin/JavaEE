package com.itheima.接口的定义格式;

public class AirPlane implements Flyable {
    @Override
    public void fly() {
        System.out.println("飞机靠引擎飞行");
    }
}
