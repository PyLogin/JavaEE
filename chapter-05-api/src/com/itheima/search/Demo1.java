package com.itheima.search;

public class Demo1 {
    public static void main(String[] args) {
        int[] intArray = {13,14,20,25,29,34,37,42,45,46,56,65,77,88};
        System.out.println(binarySearch(intArray, 13));

    }

    /**
     * 方法可以根据二分查找
     * @param intArray 目标数据
     * @param target 目标元素
     * @return
     */

    public static int binarySearch(int[] intArray, int target) {
        int start = 0;
        int end = intArray.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (intArray[middle] == target) {
                return middle; // 如果middle对应的元素就是目标值则返回middle
            } else if (target < intArray[middle]) {
                end = middle - 1; // 如果目标值小于中间值，则说明在中间元素在左边
            } else {
                start = middle + 1;// 如果目标值小于中间值，则说明在中间元素在右边
            }
        }
        return -1;
    }
}
