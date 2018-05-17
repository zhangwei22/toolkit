package com.tool.kit.test.case20180504;

/**
 * Created by zhangwei on 2018/5/4.
 */
public class Instrument {
    public void play() {
        System.out.println("I am play() of Instrument.");
    }

    static void tune(Instrument i) {
        i.play();
    }

}
