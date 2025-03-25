package com.itheima.homework;

public abstract class Animal {
    private String color;
    private int numberOfLegs;

    public Animal(int numberOfLegs, String color) {
        this.numberOfLegs = numberOfLegs;
        this.color = color;
    }

    public Animal() {
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
}
