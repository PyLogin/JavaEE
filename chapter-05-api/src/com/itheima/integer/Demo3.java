package com.itheima.integer;

public class Demo3 {
    public static void main(String[] args) {
        String number = "250";
        Integer i = Integer.valueOf(number);
        System.out.println("[i]" + i + "[i+20]" + (i + 20));

        String strOne = String.valueOf(i);
        System.out.println(strOne);

    }
}
