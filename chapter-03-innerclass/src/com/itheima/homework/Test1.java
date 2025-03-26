package com.itheima.homework;

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student("金莲",23);
        Student student1 = new Student("大朗",40);
        student.show();
        student1.show();
        Student.classRoom = "111教室";
        student.show();
        student1.show();



    }
}
