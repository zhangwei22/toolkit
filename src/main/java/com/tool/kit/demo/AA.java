package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/5.
 */
public class AA {

    public static void main(String[] args) {
        Box<String> box = new Box<>("zhangwei");
        System.out.println("name:" + box.getData());

        Box<Integer> box1 = new Box<>(24);
        System.out.println("number:" + box1.getData());

        getData(box);
        getData(box1);
    }

    public static void getData(Box<?> data) {
        System.out.println("data:" + data.getData());
    }

    public static void getUpperNumerData(Box<? extends Number> data) {
        System.out.println("number:" + data.getData());
    }

}
