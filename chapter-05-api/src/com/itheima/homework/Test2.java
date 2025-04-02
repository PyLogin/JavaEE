package com.itheima.homework;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {3,9,7,5};
        getMarForArray(arr);
    }

    public static void getMarForArray(int[] arr){
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException("数组为空");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

