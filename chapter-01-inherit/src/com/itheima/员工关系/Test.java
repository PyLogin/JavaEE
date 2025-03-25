package com.itheima.员工关系;

public class Test {
    public static void main(String[] args) {
        AndroidDeveloper androidDeveloper = new AndroidDeveloper(001,"王二狗");
        NetWorkDeveloper netWorkDeveloper = new NetWorkDeveloper(002,"李钢弹");
        JavaEEDeveloper javaEEDeveloper = new JavaEEDeveloper(003,"赵大");
        HardWareDeveloper hardWareDeveloper = new HardWareDeveloper(004,"赵四");

        androidDeveloper.work();
        netWorkDeveloper.work();
        javaEEDeveloper.work();
        hardWareDeveloper.work();

        hardWareDeveloper.certificate();
        netWorkDeveloper.certificate();
    }
}
