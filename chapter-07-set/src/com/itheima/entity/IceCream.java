package com.itheima.entity;

import com.itheima.generic.Machine;

public class IceCream {
    String taste;

    public IceCream(String taste) {
        this.taste = taste;
    }

    public IceCream() {
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "taste='" + taste + '\'' +
                '}';
    }
}
