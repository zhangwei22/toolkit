package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/6/22.
 */
public class Test03 {
    public static void main(String[] args) {
        char ch = 'J';
        char j = (char) (ch + 32);
        System.out.println(j);
        char ch2 = 'a';
        int ch3 = ch2;
        ch3 += -32;
        System.out.println((char)ch3);
    }

}
