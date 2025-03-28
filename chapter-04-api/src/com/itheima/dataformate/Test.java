package com.itheima.dataformate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println("请按照格式输入生日(1999年11月11日)");
        String date = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birth = sdf.parse(date);

        Date now = new Date();
        long birLong = now.getTime() - birth.getTime();
        System.out.println(birLong / 1000 / 60 / 60 / 24);

    }
}
