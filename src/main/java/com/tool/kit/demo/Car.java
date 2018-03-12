package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/9.
 */
public class Car extends Traffic {
    public Car() {
        System.out.println("car构造方法");
    }

    static {
        System.out.println("car静态代码块");
    }

    {
        System.out.println("car非静态代码块");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car = new Car();
    }
}
