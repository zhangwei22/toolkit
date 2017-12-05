package com.xiao.phone.buy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication public class XiaomiPhoneBuyApplication implements InitializingBean {

    public static void main(String[] args) {
        SpringApplication.run(XiaomiPhoneBuyApplication.class, args);
    }

    @Override public void afterPropertiesSet() throws Exception {
		    MyThread th1 = new MyThread("A");
        MyThread th2 = new MyThread("B");
        MyThread th3 = new MyThread("C");
        MyThread th4 = new MyThread("D");
        MyThread th5 = new MyThread("E");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
