package com.itheima.homework;

public class Test {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone("小米", 1899);
        newPhone.playGame();
        newPhone.call("钢弹");
        newPhone.show();
        System.out.println("品牌为：" + newPhone.getBrand() + "价格为：" + newPhone.getPrice());
    }
}
