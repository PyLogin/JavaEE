package com.itheima.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入转账的金额");
        String money = scanner.next();
        double v = yuanToFen(money);
        System.out.println(v);
    }

    /**
     * 进行金额转换
     * @param money
     */
    private static double yuanToFen(String money) {
        BigDecimal moneyBigDecimal = new BigDecimal(money);
        BigDecimal yuan = new BigDecimal("100");
        BigDecimal fen = moneyBigDecimal.multiply(yuan);

        BigDecimal result = fen.divide(yuan, 2, BigDecimal.ROUND_HALF_UP);
        double v = result.doubleValue();
        return v;
    }
}
