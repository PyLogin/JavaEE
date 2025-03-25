package com.itheima.员工关系;

public class NetWorkDeveloper extends Mainter {
    @Override
    public void work() {
        System.out.println("员工id为" + this.getId() + "姓名为" + this.getName() + "网络工程师正在剪网线！");
    }

    public NetWorkDeveloper() {
    }

    public NetWorkDeveloper(int id, String name) {
        super(id, name);
    }
}
