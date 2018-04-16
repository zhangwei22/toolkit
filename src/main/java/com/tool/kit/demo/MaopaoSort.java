package com.tool.kit.demo;

import java.math.BigDecimal;

/**
 * Created by zhangwei on 2018/3/6.
 */
public class MaopaoSort {

    public static void main(String[] args) {
        MaopaoSort maopaoSort = new MaopaoSort();
        maopaoSort.test();
        //        int[] arr = { 3, 4, 9, 5, 7, 8, 1, 6, 2 };
        //        int len = arr.length;
        //        int tmp;
        //        for (int i = 0; i < len - 1; i++) {
        //            for (int j = 0; j < len - i - 1; j++) {
        //                if (arr[j] > arr[j + 1]) {
        //                    tmp = arr[j];
        //                    arr[j] = arr[j + 1];
        //                    arr[j + 1] = tmp;
        //                }
        //            }
        //            for (int n = 0; n < len; n++) {
        //                System.out.print(arr[n] + ",");
        //            }
        //            System.out.println();
        //        }
        //
        //        System.out.println("排完序后输出：");
        //        for (int i = 0; i < len; i++) {
        //            System.out.print(arr[i] + ",");
        //        }
    }

    public void test() {
        BigDecimal a = new BigDecimal(18);
        BigDecimal b = new BigDecimal(8);
        //        BigDecimal add = a.add(b);
        //        BigDecimal sub = a.subtract(b);
        //        BigDecimal mul = a.multiply(b);
        BigDecimal s = a.divide(b);
        //        BigDecimal rem = a.remainder(b);//求余
        System.out.println(s);
    }
}
