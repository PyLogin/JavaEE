package com.itheima.homework;

public class NewPhone extends OldPhone{
    public void playGame(){
        System.out.println("王者荣耀运行起来啦");
    }

    public NewPhone(String brand, String name) {
        super(brand, name);
    }

    public NewPhone() {
    }
}
