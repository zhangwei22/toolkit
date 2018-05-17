package com.tool.kit.test.case20180504;

/**
 * Created by zhangwei on 2018/5/4.
 */
public class Insect {
    private int i =9;
    protected int j;
    Insect(){
        System.out.println("i="+i+", j="+j);
        j=39;
    }
    private static int x1=printInit("");
}
