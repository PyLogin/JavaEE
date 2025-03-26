package com.itheima.static修饰代码块;

import java.util.ArrayList;

public class HotNews {
    private static ArrayList<String> news = new ArrayList<>();

    static {
        news.add("热点新闻1：加长版三伏天明天开启");
        news.add("热点新闻2：加长版三伏天后天开始");
    }
    public static void showTop5News(){
        for (int i = 0; i < news.size(); i++) {
            System.out.println(news.get(i));
        }
    }
}
