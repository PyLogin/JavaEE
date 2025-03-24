package com.itheima.方法重新案例;

public class NewPhone extends OldPhone {
    @Override
    public void call(String name) {
        super.call(name);
        System.out.println("备忘录音到备忘录");
    }

    @Override
    public void sendMessage(String name, String message) {
        super.sendMessage(name, message);

    }

    @Override
    public void show() {
        super.show();
        System.out.println("归属地是北京！");
    }
}
