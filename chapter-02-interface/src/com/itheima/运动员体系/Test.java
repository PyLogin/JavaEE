package com.itheima.运动员体系;

public class Test {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer(20,"zhangertou");
        PingPangPlayer pingPangPlayer = new PingPangPlayer(23,"zhangjike");
        PingPangCoach pingPangCoach = new PingPangCoach(50,"liuguoliang");
        BasketballCoach basketballCoach = new BasketballCoach(79,"安西教练");

        basketballCoach.eat();
        basketballCoach.teach();

        pingPangPlayer.study();
        pingPangPlayer.studyEnglish();
        pingPangPlayer.eat();

        basketballPlayer.study();
        basketballPlayer.eat();


        pingPangCoach.studyEnglish();
        pingPangCoach.eat();
        pingPangCoach.teach();
    }
}
