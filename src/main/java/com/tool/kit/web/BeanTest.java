package com.tool.kit.web;

/**
 * Created by zhangwei on 2018/1/31.
 */
public final class BeanTest {
    private Integer a;

    BeanTest(Integer value) {
        this.a = value;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }
}
