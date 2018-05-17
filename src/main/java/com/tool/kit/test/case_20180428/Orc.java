package com.tool.kit.test.case_20180428;

/**
 * Created by zhangwei on 2018/4/28.
 */
class Villain {
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;

    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc " + orcNumber + " : " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
