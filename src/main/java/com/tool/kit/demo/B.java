package com.tool.kit.demo;

import java.lang.reflect.Method;

/**
 * Created by zhangwei on 2018/3/10.
 */
public class B extends A {
    //    static {
    //        System.out.println("a");
    //    }
    //
    //    public B() {
    //        System.out.println("b");
    //    }
    //
    //    public static void main(String[] args) {
    //        A ab = new B();
    //        ab = new B();
    //
    //    }
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
