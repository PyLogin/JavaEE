package com.itheima.generic;


public class GenericDemo4 {
    public static void main(String[] args) {
        useMachine(new Machine<String>() {
            @Override
            public String make() {
                return "水缸";
            }
        });

    }

    public static void useMachine(Machine<String> machine){
        String result = machine.make();
        System.out.println(result);

    }

}
