package com.tool.kit.test.case20180619.impl;

import com.tool.kit.test.case20180619.Instrument;
import com.tool.kit.test.case20180619.Note;

/**
 * Created by zhangwei on 2018/6/20.
 */
public class Brass extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play()" + note);
    }
}
