package com.itheima.homework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student s1 = new Student("小亮", 1, 99);
        Student s2 = new Student("小强", 2, 85);
        Student s3 = new Student("小红", 3, 90);
        Student s4 = new Student("小勇", 1, 75);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        int score = studentList.get(0).getScore();

        int index = 0;

        for (int i = 0; i < studentList.size(); i++) {
            int chengji = studentList.get(i).getScore();
            if (chengji < score) {
                index = i;
            }
        }
        studentList.remove(index);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("候选人Id：" + studentList.get(i).getId() + "候选人姓名：" + studentList.get(i).getName() + "候选人分数：" + studentList.get(i).getScore());
        }
    }
}
