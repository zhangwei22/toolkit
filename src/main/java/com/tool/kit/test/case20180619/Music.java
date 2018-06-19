package com.tool.kit.test.case20180619;

import com.tool.kit.test.case20180619.impl.Wind;

/**
 * Created by zhangwei on 2018/6/19.
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        //向上转型
        tune(flute);
    }
}
