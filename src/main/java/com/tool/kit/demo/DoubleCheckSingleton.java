package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/3/6.
 * 双重校验实现单例模式
 */
public class DoubleCheckSingleton {
    private volatile static DoubleCheckSingleton dcs;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getDoubleCheckSingleton() {
        if (dcs == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (dcs == null) {
                    dcs = new DoubleCheckSingleton();
                }
            }
        }
        return dcs;
    }
}
