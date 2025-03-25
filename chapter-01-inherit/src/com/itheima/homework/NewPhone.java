package com.itheima.homework;

public class NewPhone extends OldPhone {
    public NewPhone(String brand, double price) {
        super(brand, price);
    }

    public NewPhone() {
    }

    public void playGame() {
        System.out.println("王者荣耀运行起来啦");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("归属地是北京");
        System.out.println("头像是柳岩");
    }
}
