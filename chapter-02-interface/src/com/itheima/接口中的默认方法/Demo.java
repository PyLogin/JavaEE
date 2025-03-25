package com.itheima.接口中的默认方法;

public class Demo {
    public static void main(String[] args) {
        // 目标：掌握默认方法的定义方式

        Alipay alipay = new Alipay();
        alipay.pay(11);
        alipay.payWithCertificate(30);

        WeiPay weiPay = new WeiPay();
        weiPay.pay(20);
        weiPay.payWithCertificate(30);
    }
}
