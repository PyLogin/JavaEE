package com.itheima.homework;

public class OldPhone {
    String brand;
    String name;

    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void senMessage(){
        System.out.println("发短信");
    }

    public OldPhone(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public OldPhone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
