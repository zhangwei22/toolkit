package com.tool.kit.demo;

/**
 * Created by zhangwei on 2018/7/2.
 */
public class Box<T> {
    private T data;
    public Box(){}
    public Box(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }
}
