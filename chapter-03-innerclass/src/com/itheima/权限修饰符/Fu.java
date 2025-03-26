package com.itheima.权限修饰符;

public class Fu {
    public String name = "张三";

    protected int age = 18;

    int salary = 10000;

    private double b = 9.0;

    public void show(){
        System.out.println(name);
    }

    protected void show2(){
        System.out.println(age);
    }

    void show3(){
        System.out.println(salary);
    }

    private void show4(){
        System.out.println(b);
    }
}
