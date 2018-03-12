package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/12.
 */
public class VolatileDemo {

    private static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (!stop) {
                i++;
                //                System.out.println("i:" + i);
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("执行");
        stop = true;
    }
}
