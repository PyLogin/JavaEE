package com.itheima.员工关系;

public class HardWareDeveloper extends Mainter {
    @Override
    public void work() {
        System.out.println("员工id为" + this.getId() + "姓名为" + this.getName() + "硬件工程师正在维护交换机！");
    }

    public HardWareDeveloper() {
    }

    public HardWareDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void certificate() {
        System.out.println("硬件维护四级证书");
    }
}
