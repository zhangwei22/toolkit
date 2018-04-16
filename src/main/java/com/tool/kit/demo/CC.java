package com.tool.kit.demo;

import java.awt.*;

/**
 * Created by zhangwei on 2018/3/18.
 */
public class CC {

    private void valueTtaffic(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    public static void main(String[] args) {
        CC c = new CC();
        Integer i = 78;
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        c.valueTtaffic(a, b);
        System.out.println(a + "." + b);
    }
}
