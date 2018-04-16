package com.tool.kit.test;

import java.util.Date;
import java.util.Properties;

/**
 * Created by zhangwei on 2018/3/12.
 */
public class A {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println(p);
        System.out.println("______Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory=" + rt.totalMemory() + ", Free Memory=" + rt.freeMemory());

        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {

        }
        System.out.println("end sleep...");
    }
}
