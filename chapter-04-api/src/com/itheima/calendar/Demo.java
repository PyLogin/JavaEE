package com.itheima.calendar;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握calendar定义和使用API

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int month = calendar.get(Calendar.MONDAY) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year + "-" + month + "-" + day);



    }
}
