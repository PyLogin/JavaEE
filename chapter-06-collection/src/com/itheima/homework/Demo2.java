package com.itheima.homework;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Objects;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("张无极", "河北"));
        list.add(new Student("张三丰", "河南"));
        list.add(new Student("周芷若", "四川"));
        list.add(new Student("赵敏", "蒙古"));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("张三丰")) {
                Student s = new Student(list.get(i).getName(), "山东");
                list.set(i, s);
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + list.get(i).getAddress());
        }
    }

    static class Student {
        private String name;
        private String address;

        public Student() {
        }

        public Student(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(address, student.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, address);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}
