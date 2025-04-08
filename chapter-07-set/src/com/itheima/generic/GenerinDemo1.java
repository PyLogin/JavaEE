package com.itheima.generic;

import com.itheima.entity.Student;

public class GenerinDemo1 {
    public static void main(String[] args) {
        Box<String> b = new Box();
        b.setT("张二狗");
        System.out.println(b.getT());


        Box<Student> s1 = new Box<>();
        s1.setT(new Student(123123,23,"hahh"));
        System.out.println(s1.getT());
    }
}
