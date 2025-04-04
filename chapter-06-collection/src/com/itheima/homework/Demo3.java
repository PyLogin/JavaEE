package com.itheima.homework;

import java.util.Objects;

public class Demo3 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();


    }
    static class User{
        private String name;
        private String password;

        public User() {
        }

        public User(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name) && Objects.equals(password, user.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, password);
        }
    }
}

