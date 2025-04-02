package com.itheima.exp;

public class Demo2 {
    public static void main(String[] args) {
        //register("张三",23);
        register("哈哈哈哈哈哈hahhahahahahah哈哈哈",45);
        register("哈哈哈哈哈哈",145);


    }

    public static void register(String name, Integer age) {
        if (name.length() > 10) {
            throw new RegisterException("名字太长了，不建议你是用");
        }else if (age <0 || age > 100) {
            throw new RegisterException("年龄太大了，你是老妖怪么？");
        }
        System.out.println("账号注册成功！");
    }
}
