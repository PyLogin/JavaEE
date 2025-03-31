package com.itheima.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double[] oldPrice = {23.6, 34.4, 35.4, 36.8, 78.9, 89.5};
        System.out.println("请您输入一个商品价格");
        double price = new Scanner(System.in).nextDouble();
        double[] newPrice = new double[oldPrice.length + 1];

        System.arraycopy(oldPrice, 0, newPrice, 0, oldPrice.length);

        newPrice[newPrice.length - 1] = price;

        Arrays.sort(newPrice);
        System.out.println(Arrays.toString(newPrice));


    }
}
