package com.itheima.homework;

public class Student {
    private String name;
    private int age;
    static String classRoom = "101教室";


    public void show() {
        System.out.println("姓名是：" + name + "年龄是：" + age + "的学生在" + classRoom + "上课");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return classRoom;
    }

    public static void setRoom(String classRoom) {
        Student.classRoom = classRoom;
    }
}
