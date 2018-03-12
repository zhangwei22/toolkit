package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/9.
 */
public class Traffic {

    public Traffic() {
        System.out.println("traffic构造方法");
    }

    static {
        System.out.println("traffic静态代码块");
    }

    {
        System.out.println("traffic非静态代码块");
    }
}
