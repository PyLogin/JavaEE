package com.itheima.员工关系;

public class Employee {
    private String name;
    private int id;

    public void work() {
        System.out.println("员工正在工作中....");
    }

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
