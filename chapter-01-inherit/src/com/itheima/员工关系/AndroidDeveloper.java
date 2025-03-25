package com.itheima.员工关系;

public class AndroidDeveloper extends Developer {
    @Override
    public void work() {
        System.out.println("员工id为"+this.getId()+"姓名为"+this.getName()+"Android开发工程师正在开发淘宝手机客户端！");
    }

    public AndroidDeveloper() {
    }

    public AndroidDeveloper(int id, String name) {
        super(id, name);
    }
}
