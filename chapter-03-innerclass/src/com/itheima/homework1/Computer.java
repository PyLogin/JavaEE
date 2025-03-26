package com.itheima.homework1;

public class Computer {
    public void start(){
        System.out.println("电脑开机了");
    }

    public void useUsb(Usb usb){
        usb.open();
        usb.close();
    }

    public void tureDown(){
        System.out.println("电脑关机了");
    }
}
