package com.tool.kit.test.case20180620.impl;

import com.tool.kit.test.case20180620.Shape;

/**
 * Created by zhangwei on 2018/6/20.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }
}
