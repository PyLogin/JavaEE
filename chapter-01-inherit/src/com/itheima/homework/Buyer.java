package com.itheima.homework;

public class Buyer extends AdminStaff{
    @Override
    public void work() {
        System.out.println("工号为"+getId()+"的采购专员"+getName()+"正在采购物品");
    }
}
