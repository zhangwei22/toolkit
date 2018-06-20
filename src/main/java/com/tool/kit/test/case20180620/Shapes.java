package com.tool.kit.test.case20180620;

/**
 * Created by zhangwei on 2018/6/20.
 */
public class Shapes {
    private static RandomShapeGenerrator generrator = new RandomShapeGenerrator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = generrator.next();
        }

        for (Shape shape : s) {
            shape.draw();
            shape.erase();
            shape.print();
        }
    }
}
