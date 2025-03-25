package com.itheima.homework;

public class Lecturer extends Teacher{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的讲师"+getName()+"正在讲课");
    }
}
