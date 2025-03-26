package com.itheima.static修饰成员变量;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();

        student1.show();
        student2.show();
        student.show();


        Student.room = "hahhh";

        student1.show();
        student2.show();
        student.show();



    }

}
