package com.tool.kit.test;

/**
 * Created by zhangwei on 2018/4/16.
 */
public class BaseTypeTest {
    private String name;
    private String sex;
    private int age;
    private String school;

    BaseTypeTest setName(String name) {
        this.name = name;
        return this;
    }

    BaseTypeTest setSex(String sex) {
        this.sex = sex;
        return this;
    }

    BaseTypeTest setAge(int age) {
        this.age = age;
        return this;
    }

    BaseTypeTest setSchool(String school) {
        this.school = school;
        return this;
    }

    BaseTypeTest agePP(){
        this.age++;
        return this;
    }

    public String printParams() {
        String result = "name:" + this.name;
        result += ", sex:" + this.sex;
        result += ", age:" + this.age;
        result += ", school:" + this.school;
        return result;
    }

    public static void main(String[] args) {
        BaseTypeTest a = new BaseTypeTest();
        System.out.println(a.printParams());
        a.setName("zhangwei").setSex("boy").setAge(26).setSchool("jxaux.com.cn");
        System.out.println(a.printParams());

        a.agePP().agePP().agePP();
        System.out.println(a.printParams());
    }
}
