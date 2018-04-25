package com.tool.kit.test.test_20180421;

/**
 * Created by zhangwei on 2018/4/21.
 */
public class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table.init");
    }

    void f2(int marker) {
        System.out.println("method f2.marker=" + marker);
    }

    static Bowl bowl2 = new Bowl(2);
}
