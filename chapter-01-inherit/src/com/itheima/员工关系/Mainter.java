package com.itheima.员工关系;

public abstract class Mainter extends Employee {
    public Mainter() {
    }

    public Mainter(int id, String name) {
        super(id, name);
    }

    //所有的维护工程师有一个考证书的方法
    public abstract void certificate();
}
