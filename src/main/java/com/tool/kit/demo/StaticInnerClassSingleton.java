package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/6.
 * 静态内部类实现单例模式
 */
public class StaticInnerClassSingleton {
    private static class StaticInnerClass {
        private static StaticInnerClassSingleton sics = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getStaticInnerClassSingleton() {
        return StaticInnerClass.sics;
    }
}
