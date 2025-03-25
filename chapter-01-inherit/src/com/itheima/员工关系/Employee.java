package com.itheima.员工关系;

public abstract class Employee {
    private String name;
    private int id;

    public abstract void work();

    public Employee() {
    }

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
