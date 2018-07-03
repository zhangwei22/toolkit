package com.tool.kit.zhangyun;

/**
 * Created by zhangwei on 2018/6/28.
 */
public class Test04 {

    public int[] convert(int[] a) {
        int j = 0;
        int k = a.length;
        int[] b = new int[k];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            } else {
                b[k - 1] = a[i];
                k--;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Test04 test04 = new Test04();
        int[] arr = { 1, 2, 333, 4, 5, 611, 22, 33, 44, 55, 66 };
        int[] newArr = test04.convert(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
