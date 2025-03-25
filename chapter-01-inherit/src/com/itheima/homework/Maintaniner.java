package com.itheima.homework;

public class Maintaniner extends AdminStaff {
    @Override
    public void work() {
        System.out.println("工号为" + getId() + "的维护专员" + getName() + "正在维修电视");
    }
}
