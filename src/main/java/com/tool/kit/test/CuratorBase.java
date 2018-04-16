package com.tool.kit.test;


/**
 * Created by zhangwei on 2018/4/7.
 */
public class CuratorBase {

    public static void main(String[] args) {
        //1.重试策略：初始时间为1s，重试10次

        Object[] arr = new Object[10];
        arr[0] = 1;
        arr[1] = "abc";
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}
