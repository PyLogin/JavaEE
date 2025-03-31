package com.itheima.calendarandday;

import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握calendar转换day对象

        //现在有一个表示当前时间点的Datae对象需要进行操作(Date->Calendar)
        Date now = new Date(1000L);

        //(1)获取一个Calendar子类对象(子类对象当前时间无所谓)
        Calendar cal = Calendar.getInstance();

        cal.setTime(now);

    }
}
