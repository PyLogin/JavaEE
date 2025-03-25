package com.itheima.homework;

public class OldPhone {
    private String brand;
    private double price;

    public OldPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public OldPhone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setName(double price) {
        this.price = price;
    }

    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void show(){
        System.out.println("显示手机号");
    }

    public void senMessage(){
        System.out.println("发短信");
    }
}
