package com.tool.kit.test;

/**
 * Created by zhangwei on 2018/4/12.
 */
public class InnerOuterTest {
    public static void main(String[] args) {
        int i = 0;
        for (; true; ) {
            //            inner:
            outer:
            for (; i < 10; i++) {
                System.out.println(i);
                if (i == 2) {
                    break;
                }
            }
        }
    }
}
