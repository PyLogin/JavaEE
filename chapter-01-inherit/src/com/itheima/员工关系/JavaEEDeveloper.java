package com.itheima.员工关系;

public class JavaEEDeveloper extends Developer {
    @Override
    public void work() {
        System.out.println("员工id为" + this.getId() + "姓名为" + this.getName() + "JavaEE工程师正在开发淘宝网站！");
    }

    public JavaEEDeveloper() {
    }

    public JavaEEDeveloper(int id, String name) {
        super(id, name);
    }
}
