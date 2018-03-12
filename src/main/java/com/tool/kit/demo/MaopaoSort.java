package com.tool.kit.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangwei on 2018/3/6.
 */
public class MaopaoSort {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("a", 123);
        map.put("b", null);
        map.put("c", null);
        map.put("a", null);

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        /***
        int[] arr = { 3, 4, 5, 7, 8, 1, 6, 2, 9 };
        int len = arr.length;
        int tmp;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        ***/
    }
}
