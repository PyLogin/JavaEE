package com.itheima.exp;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握exception定义格式

        try {
            showTwo(20.2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void showOne(int i) {
        if (i > 100) {
            throw new RuntimeException("参数[i]范围不合法");
        }
    }

    public static void showTwo(double i) throws Exception {
        if (i > 100) {
            throw new Exception("参数[i]范围不合法");
        }
        System.out.println("程序正常运行,[i]的值为：" + i);
    }
}
