package com.itheima.接口中的默认方法;

public class Alipay implements Payable {
    @Override
    public void pay(double money) {
        System.out.println("支付宝支付了" + money + "元");
    }

    @Override
    public void payWithCertificate(double money) {
        System.out.println("支付宝通过证书支付了" + money + "元");
    }
}
