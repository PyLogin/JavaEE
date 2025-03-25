package com.itheima.运动员体系;

public class BasketballCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("姓名是" + this.getName() + "并且年龄是" + this.getAge() + "的篮球教练员，正在练习假摔");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }
}
