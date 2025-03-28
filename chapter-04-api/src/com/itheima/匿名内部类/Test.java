package com.itheima.匿名内部类;

public class Test {
    public static void main(String[] args) {
        new Smokeable() {
            @Override
            public void smoke() {

            }
        };
    }
}
