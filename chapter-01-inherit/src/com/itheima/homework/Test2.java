package com.itheima.homework;

public class Test2 {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setId(666);
        lecturer.setName("乔峰");
        lecturer.work();

        Tutor tutor = new Tutor();
        tutor.setId(686);
        tutor.setName("段誉");
        tutor.work();

        Maintaniner maintaniner = new Maintaniner();
        maintaniner.setId(666);
        maintaniner.setName("柳岩");
        maintaniner.work();

        Buyer buyer = new Buyer();
        buyer.setId(888);
        buyer.setName("景甜");
        buyer.work();


    }
}
