package com.tool.kit.zhangyun;

/**
 * Created by zhangwei on 2018/6/28.
 */
public class Test03 {
    public boolean panduan(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 4, 5, 6, 66, 77, 8, 89 };
        int num = 5;
        Test03 test03 = new Test03();
        boolean state = test03.panduan(arr, num);
        System.out.println(state);
    }
}
