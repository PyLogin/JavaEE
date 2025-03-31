package com.itheima.array;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] intArray = {13, 14, 20, 25, 29, 34, 37, 42, 45, 46, 56, 65, 77, 88};
        String stringArray = Arrays.toString(intArray);
        System.out.println(stringArray);

        double[] doubleArray = {3, 4.5, 1.1, 2.2};
        Arrays.sort(doubleArray);
        int indexOne = Arrays.binarySearch(intArray, 65);

        int indexTwo = Arrays.binarySearch(doubleArray, 2.2);

        System.out.println("indexOne:" + indexOne);
        System.out.println("indexTwo:" + indexTwo);
    }
}
