package com.tool.kit.demo;

import java.lang.reflect.Method;

/**
 * Created by zhangwei on 2018/3/10.
 */
public class B {
    public static void main(String[] args) {
        String str = "Hello World!";
        try {
            Method m = str.getClass().getMethod("toUpperCase");
            System.out.println(m.invoke(str));
        } catch (Exception n) {
            System.out.println("no such method exception");
        }
    }
}
