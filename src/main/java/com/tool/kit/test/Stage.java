package com.tool.kit.test;

/**
 * Created by zhangwei on 2018/11/1.
 */
public class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}
