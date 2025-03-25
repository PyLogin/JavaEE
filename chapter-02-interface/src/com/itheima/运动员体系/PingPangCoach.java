package com.itheima.运动员体系;

public class PingPangCoach extends Coach implements LearnEnglish{
    @Override
    public void teach() {
        System.out.println("姓名是" + this.getName() + "并且年龄是" + this.getAge() + "的乒乓球教练员，正在教学摔牌子");
    }

    @Override
    public void studyEnglish() {
        System.out.println("I fule you");
    }

    public PingPangCoach() {
    }

    public PingPangCoach(int age, String name) {
        super(age, name);
    }
}
