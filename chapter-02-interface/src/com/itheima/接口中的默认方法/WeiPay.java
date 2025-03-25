package com.itheima.接口中的默认方法;

public class WeiPay implements Payable {
    @Override
    public void pay(double money) {
        System.out.println("微信支付了" + money + "元");
    }
}
