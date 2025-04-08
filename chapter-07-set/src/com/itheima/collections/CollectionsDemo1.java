package com.itheima.collections;

import com.itheima.entity.Student;

import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Collections.addAll(studentList, new Student(123213, 23, "李铁柱"),
                new Student(123123, 45, "张二狗"),
                new Student(12312321,55,"赵四"));
        System.out.println("StudentList:"+studentList);
        Collections.shuffle(studentList);
        System.out.println(studentList);

        for(Student student : studentList) {
            System.out.println(student);
        }
    }
}
