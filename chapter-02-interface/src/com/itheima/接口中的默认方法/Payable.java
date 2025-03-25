package com.itheima.接口中的默认方法;

/**
 * 支付接口
 */
public interface Payable {
    void pay(double money);
    public default void payWithCertificate(double money){
        System.out.println("通过证书支付的方法执行了");
    };
}
