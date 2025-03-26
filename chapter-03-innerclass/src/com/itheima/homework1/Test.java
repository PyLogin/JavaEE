package com.itheima.homework1;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        computer.useUsb(new Usb() {
            @Override
            public void open() {
                System.out.println("鼠标开启了");
            }

            @Override
            public void close() {
                System.out.println("鼠标关闭了");
            }
        });
        computer.useUsb(new Usb() {
            @Override
            public void open() {
                System.out.println("键盘开启了");
            }

            @Override
            public void close() {
                System.out.println("键盘关闭了");
            }
        });

        computer.tureDown();
    }
}
