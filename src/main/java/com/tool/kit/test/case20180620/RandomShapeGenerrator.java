package com.tool.kit.test.case20180620;

import com.tool.kit.test.case20180620.impl.Circle;
import com.tool.kit.test.case20180620.impl.Square;
import com.tool.kit.test.case20180620.impl.Triangle;

import java.util.Random;

/**
 * Created by zhangwei on 2018/6/20.
 */
public class RandomShapeGenerrator {
    private Random random = new Random(47);

    public Shape next() {
        switch (random.nextInt(3)) {
        default:
        case 0:
            return new Circle();
        case 1:
            return new Square();
        case 2:
            return new Triangle();
        }
    }
}
