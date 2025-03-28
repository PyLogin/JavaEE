package com.itheima.object类;



import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握Object API定义和使用
        Student student = new Student("zhangersou",29);
        Student student1 = new Student("zhangersou",29);

        System.out.println(student.equals(student1));

        Date date = new Date(1000L);
        System.out.println(date);



    }
}
