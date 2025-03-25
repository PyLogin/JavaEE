package com.itheima.homework;

public class Tutor extends Teacher {
    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的助教" + getName() + "正在备课");
    }
}
