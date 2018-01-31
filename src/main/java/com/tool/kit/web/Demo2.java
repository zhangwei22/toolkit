package com.tool.kit.web;

/**
 * Created by zhangwei on 2018/1/30.
 */
public class Demo2 {
    public BeanTest bt = new BeanTest(6);

    public static void main(String args[]) {
        Demo2 sv = new Demo2();
        sv.change(sv.bt);
        System.out.println(sv.bt.getA());
    }

    public void change(BeanTest beanTest) {
        beanTest = new BeanTest(50);
//        beanTest.setA(10);
    }

}
