package com.tool.kit.test;

/**
 * Created by zhangwei on 2018/4/16.
 */
public class InstanceFlowTest {
    InstanceFlowTest(){
        System.out.println("___");
    }

    InstanceFlowTest(int i){
//        this();
        System.out.println("int i");
    }

    InstanceFlowTest(String s){
        System.out.println("string s");
    }

    public static void main(String[] args) {
        InstanceFlowTest instanceFlowTest = new InstanceFlowTest();
    }
}
