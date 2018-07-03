package com.tool.kit.zhangyun;

/**
 * Created by zhangwei on 2018/6/28.
 */
public class Test02 {

    public String[] joke(String[] arr, int number) {
        String[] newArr = new String[20];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == number) {
                newArr[j] = arr[i];
                j++;
            }
        }
        newArr[j] = "";
        return newArr;
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        String[] arr = { "rose", "jack", "madam", "dearling", "honey" };
        int number = 5;
        String[] nArr = test02.joke(arr, number);
        for (int i = 0; i < nArr.length; i++) {
            if ("".equals(nArr[i])) {
                break;
            }
            System.out.println(nArr[i]);
        }
    }
}
