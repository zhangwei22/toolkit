package com.tool.kit.test.test_20180421;

/**
 * Created by zhangwei on 2018/4/21.
 */
public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("create new Cupboard in main");
        new Cupboard();
        System.out.println("create new Cupboard in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
