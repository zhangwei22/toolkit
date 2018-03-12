package com.tool.kit.test;

import java.math.BigDecimal;

/**
 * Created by zhangwei on 2018/3/7.
 */
public class MainTest {
    public static void main(String[] args) {
        Info info = new Info();
        info.setAmount(new BigDecimal(200));

        BigDecimal tmp;
        tmp = info.getAmount();
        tmp = tmp.add(new BigDecimal(300));
        System.out.println("amount:" + info.getAmount());
        System.out.println("tmp" + tmp);

    }
}
