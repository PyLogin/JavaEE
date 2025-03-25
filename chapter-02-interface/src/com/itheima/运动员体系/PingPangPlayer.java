package com.itheima.运动员体系;

public class PingPangPlayer extends Player implements LearnEnglish{
    @Override
    public void study() {
        System.out.println("姓名是" + this.getName() + "并且年龄是" + this.getAge() + "的乒乓运动员，正在联系抽射");

    }

    @Override
    public void studyEnglish() {
        System.out.println("乒乓运动员说，hello world");
    }

    public PingPangPlayer() {
    }

    public PingPangPlayer(int age, String name) {
        super(age, name);
    }
}
