package com.tool.kit.demo;

import java.util.Stack;

/**
 * Created by zhangwei on 2018/3/9.
 */
public class Testrrrrr {

    public static void main(String[] args) {
        String originStr = "cc3[e3[bcdd]]qq";
        String a = getNewStr(originStr);
        char aaa = 'a';
        //        Character aa = Character.valueOf(aaa);
        System.out.println((int) aaa);
    }

    public static String getNewStr(String str) {
        char[] charData = str.toCharArray();
        int firstNum = 0;//第一次出现的数字
        String firstStr = "";//数字前的字符串
        String endStr = "";//右括号后的字符串
        int firstNumPosition = 0;//第一次出现数字的位置
        int endRightPosition = 0;//闭环最后一个右括号的位置
        int leftKh = 0;//进行左括号和右括号闭环计算
        boolean firstFindNum = false;//判读第一次出现数字状态
        for (int i = 0; i < charData.length; i++) {
            if (charData[i] == '[') {
                leftKh++;
            } else if (charData[i] > 0 && charData[i] <= 9) {
                if (!firstFindNum) {
                    firstNum = charData[i];
                    firstNumPosition = i;
                    firstFindNum = true;
                    firstStr = str.substring(0, i);
                }
            } else if (charData[i] == ']') {
                leftKh--;
                if (leftKh == 0) {
                    endRightPosition = i;
                    endStr = str.substring(endRightPosition + 1, str.length());
                    String betweenStr = "";
                    for (int j = 0; j < firstNum; i++) {
                        betweenStr =
                                betweenStr + str.substring(firstNumPosition + 2, endRightPosition);
                    }
                    return firstStr + getNewStr(betweenStr) + getNewStr(endStr);
                }
            }
        }

        return str;
    }

}
