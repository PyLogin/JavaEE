package com.itheima.运动员体系;

public class BasketballPlayer extends Player {
    @Override
    public void study() {
        System.out.println("姓名是" + this.getName() + "并且年龄是" + this.getAge() + "的篮球运动员，正在联系投篮");
    }

    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    public BasketballPlayer() {
    }
    //    @Override
//    public void eat() {
//        super.eat();
//    }
}
