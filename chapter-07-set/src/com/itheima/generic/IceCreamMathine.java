package com.itheima.generic;

import com.itheima.entity.IceCream;

public class IceCreamMathine implements Machine<IceCream> {

    @Override
    public IceCream make() {
        return new IceCream("鸡蛋炒大蒜");
    }
}
