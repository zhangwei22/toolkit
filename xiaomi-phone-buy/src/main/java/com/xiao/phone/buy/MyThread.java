package com.xiao.phone.buy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by zhangwei on 2017/12/5.
 */
public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override public void run() {
        //小米官网抢购红米note3页面
        String baseurl = "http://item.mi.com/buyphone/note3";
        //小米官网登录信息
        String baseurl2 = "https://account.xiaomi.com/pass/serviceLogin?callback=http%3A%2F%2Forder.mi.com%2Flogin%2Fcallback%3Ffollowup%3Dhttp%253A%252F%252Fitem.mi.com%252Fbuyphone%252Fnote3%26sign%3DZmYyZmU3NmE0NWNmMjZkYzk5YmU5ZWJjMzc2Zjg1YzNhMjY3NTJjMg%2C%2C&sid=mi_eshop";
        WebElement loginElement = null;
        List<WebElement> elementList = null;
        List<WebElement> taocan = null;
        WebElement btn = null;
        WebDriver driver = new FirefoxDriver();
        System.out.println("starting");
        driver.get(baseurl2);
        driver.findElement(By.id("username")).sendKeys("");   // 输入自己小米官网登录账号
        driver.findElement(By.id("pwd")).sendKeys("");    // 输入小米官网登录密码
        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.getCurrentUrl());

        try {
            sleep(5000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        driver.navigate().to(baseurl);
        System.out.println("hello world!!");

        elementList = driver.findElements(By.className("J_stepItem"));
        if (elementList == null || elementList.size() == 0) {
            driver.close();
        }
        elementList.get(1).click();           // 选择高配版 3GB内存 + 32GB容量
        elementList = driver.findElements(By.className("J_stepItem"));
        elementList.get(2).click();            // 选择双网通
        elementList = driver.findElements(By.className("J_stepItem"));
        elementList.get(5).click();   // 选择银白色

        taocan = driver.findElements(By.className("J_packageItem"));  // 看是否到时间出现套餐选择
        while (taocan == null || taocan.size() == 0) {
            taocan = driver.findElements(By.className("J_packageItem"));  // 一直循环等待套餐的出现
            System.out.println("listening11...." + name);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        taocan.get(0).click();    // 等到选择第一个套餐

        elementList = driver.findElements(By.className("btn"));
        elementList.get(0).click();                // 点击下一步抢购按钮  等待
        //driver.quit();
        System.out.println(elementList.size());
    }

}
