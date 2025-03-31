package com.itheima.bigdecimal;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握bigdecimal的构造和成员方法
        BigDecimal bi = new BigDecimal("10");
        System.out.println(bi);
        // 成员方法

        BigDecimal add = bi.add(new BigDecimal("1.23"));
        System.out.println(add);

        BigDecimal subtract = bi.subtract(new BigDecimal("1.23"));
        System.out.println(subtract);

        BigDecimal multiply = bi.multiply(new BigDecimal("1.23"));
        System.out.println(multiply);

        BigDecimal divide = bi.divide(new BigDecimal("3"), 2, BigDecimal.ROUND_UP);
        System.out.println(divide);

    }
}
