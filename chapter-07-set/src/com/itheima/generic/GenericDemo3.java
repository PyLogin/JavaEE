package com.itheima.generic;

public class GenericDemo3 {
    public static void main(String[] args) {
        IceCreamMathine iceCreamMathine = new IceCreamMathine();
        System.out.println(iceCreamMathine.make());


        JuiceMachine<String> juiceMachine = new JuiceMachine();
        juiceMachine.setTaste("洗脚水");
        System.out.println(juiceMachine.make());

    }
}
