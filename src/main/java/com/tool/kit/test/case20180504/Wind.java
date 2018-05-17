package com.tool.kit.test.case20180504;

/**
 * Created by zhangwei on 2018/5/4.
 */
public class Wind extends Instrument {

    public static void main(String[] args) {
        Wind wind = new Wind();
        Wind.tune(wind);
        Instrument.tune(wind);
    }
}
