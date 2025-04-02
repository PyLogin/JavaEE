package com.itheima.fightlandlords;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FightWithRichman {
    public static void main(String[] args) {
        /*----------0、 准备5个集合------------*/
        ArrayList<String> pokerList = new ArrayList<>();
        ArrayList<String> playOnePokerList = new ArrayList<>();
        ArrayList<String> playTwoPokerList = new ArrayList<>();
        ArrayList<String> playThreePokerList = new ArrayList<>();
        ArrayList<String> endPokerList = new ArrayList<>();

        /*----------1、准备牌（将牌盒中的内容添加完成）------------*/
        //1.1 定义两个string数组，分别保存花色和点数
        String[] flowerArray = {"♦", "♠", "♥", "♣"};
        String[] numberArray = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //1.2点数在外循环，花色在内循环
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < flowerArray.length; j++) {
                pokerList.add(numberArray[i] + flowerArray[j]);
            }
        }
        pokerList.add("小王");
        pokerList.add("大王");


        /*----------2、洗牌（通过Collections.shuffle方法打乱排序）------------*/
        Collections.shuffle(pokerList);

        /*----------3、发牌（通过Collections.shuffle方法打乱排序）------------*/

        for (int i = 0; i < pokerList.size(); i++) {
            if (i >= 51) {
                endPokerList.add(pokerList.get(i));
            }
            if (i % 3 == 0) {
                playOnePokerList.add(pokerList.get(i));
            } else if (i % 3 == 1) {
                playTwoPokerList.add(pokerList.get(i));
            } else if (i % 3 == 2) {
                playThreePokerList.add(pokerList.get(i));
            }
        }
        System.out.println("玩家一" + playOnePokerList);
        System.out.println("玩家二" + playTwoPokerList);
        System.out.println("玩家三" + playThreePokerList);
        System.out.println("底牌" + endPokerList);

    }
}
