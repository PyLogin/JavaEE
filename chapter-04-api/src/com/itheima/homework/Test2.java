package com.itheima.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        // 需求：员工录入入职时间，帮助同事计算入职年限
        // 1、通过Scanner键盘录入时间
        Scanner sc = new Scanner(System.in);
        System.out.println("请按照格式输入入职时间(1999年1月1日)");
        String year = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(year);

        long start = date.getTime();
        long end = System.currentTimeMillis();

        long result = end - start;
        long day = result / 1000 / 60 / 60 / 24;
        long resultYear = day / 365;
        System.out.println("您已经入职" + resultYear + "年");

    }
}
