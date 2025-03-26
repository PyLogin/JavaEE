package com.itheima.static修饰成员变量;

public class Student {
    String name;
    int age;
    static String room = "JYL";


    public void show() {
        System.out.println("学生的姓名：" + name + "学生的你年龄" + age + "班级" + room);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }
}
