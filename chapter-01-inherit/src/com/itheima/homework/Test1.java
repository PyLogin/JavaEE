package com.itheima.homework;

public class Test1 {
    public static void main(String[] args) {
        Panda panda = new Panda(4,"白色");
        PolarBear polarBear = new PolarBear(4,"白色");

        panda.eat();
        panda.climbTree();

        polarBear.eat();
        polarBear.catchFish();
    }

}
