package com.tool.kit.test.case20180626;

/**
 * Created by zhangwei on 2018/6/26.
 */
public class MessageHandler {

    public static void handlerMethod() throws Exception {
        try{
            int result = 9/0;
        }catch (Exception e){
            System.out.println("捕捉到异常");
        }
        System.out.println("捕捉到异常这里还执行吗？");
    }
}
