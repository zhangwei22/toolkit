package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/7/28.
 */
public class Test05 {

    public static void main(String[] args) {
        Student xiaoMing = new Student();
        xiaoMing.name = "王小明";
        xiaoMing.sex = "男";
        xiaoMing.age = 25;

        Student xiaoZhang = new Student();
        xiaoZhang.name = "张三";
        xiaoZhang.sex = "女";
        xiaoZhang.age = 23;

        System.out.println("小明的年龄：" + xiaoMing.age);
        System.out.println("小张的名字:" + xiaoZhang.name);
    }
}

