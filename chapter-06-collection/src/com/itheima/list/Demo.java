package com.itheima.list;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // 目标：

        // List接口的成员方法
        // 1、 public void add(int index, E e)
        // 2、 public E remove(int index)
        // 3、 public E set(int index E e)

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("宋公明");
        nameList.add("鲁智深");
        nameList.add("扈三娘");
        nameList.add("西门庆");

        nameList.add(3, "武大郎");
        System.out.println("[namelist:]" + nameList);

        // 例子2：把扈三娘删除
        nameList.remove(2);
        System.out.println("[nameList:]" + nameList);

        // 例子3：把武大郎替换为武二郎
        String repleace = nameList.set(2, "武二郎");
        System.out.println("[repleace]:" + repleace);
        System.out.println("[nameList:]" + nameList);

        // 例子3：
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
    }
}
