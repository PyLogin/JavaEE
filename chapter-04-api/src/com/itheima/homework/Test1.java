package com.itheima.homework;

import java.util.Calendar;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 作业：完成输入年份后判断2月份有多少天，并计算年份为闰年还是平年

        // 1.定义Scanner对象，调用nextInt方法，键盘录入一个年份
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入年份");
        int year = scanner.nextInt();
        // 2.调用getInstance()方法获取一个Calendar对象
        Calendar calendar = Calendar.getInstance();
        // 3.调用Calendar对象的set()方法设置年、月、日
        calendar.set(year, 2, 1);
        /* 由于国外的月份和国内的月份不一样，所以，当我们设置2月的时候其实代表的是我们国内的3月
       年份：我们输入的年份
       月份：2月(实际上是我们国内的3月)
       日：1日 */
//       4. 调用Calendar的add方法，让3月1日减去1天，就是2月的最后一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);
//       5. 调用Calendar的get方法，获取出日期
        int dayNum = calendar.get(Calendar.DATE);
//       6. 输出输入的年份2月份有多少天
        System.out.println(year + "年2月份有" + dayNum + "天");
//       7. 判断，如果得出的日期==28天，证明是平年，共365天，否则是闰年，366天
        if(dayNum == 28){
            System.out.println(year+"是平年，共365天");
        }else {
            System.out.println(year+"是润年，共366天");
        }


    }
}
