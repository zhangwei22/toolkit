package com.tool.kit.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangwei on 2018/3/5.
 */
public class AA {

    public synchronized void demo(){
        System.out.println("2364");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 7, 8, 1, 6, 2, 9 };
        int i, j, temp, len = arr.length;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < len; k++) {
            System.out.println(arr[k]);
        }


        List list = new ArrayList();
    }

}
