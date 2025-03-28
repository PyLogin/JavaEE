package com.itheima.dataformate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        // 目标：掌握SimpleDateFormat 定义、API


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String dateString = sdf.format(now);
        System.out.println(now);
        System.out.println(dateString);

        String str="2008-08-08 08:08:08";
        Date resultDate = sdf.parse(str);
        System.out.println(resultDate);
    }
}
