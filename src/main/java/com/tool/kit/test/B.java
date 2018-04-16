package com.tool.kit.test;

/**
 * Created by zhangwei on 2018/3/12.
 */
public class B {
    static int i;

    private B() {
        System.out.println("bbbbb");
    }

    public static void main(String[] args) {
        System.out.println();
        //        B b = new B();
        //        System.out.println(b.finallyTest());

        System.out.println(i);
    }

    public int finallyTest() {
        try {
            int t = 9 / 0;
            System.out.println("into method");

            return 6;

        } catch (Exception e) {
            System.out.println("catch exception");
            return 8;
        } finally {
            System.out.println("into finally");
            //            return 5;
        }
    }

}
