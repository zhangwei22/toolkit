package com.tool.kit.zhangyun;


/**
 * Created by zhangwei on 2018/6/28.
 */
public class Test01 {
    public int[] m1(int[] a){
        int[] b = new int[10];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                b[j] = a[i];
                j++;
            }
        }
        b[j]=-1;
        return b;
    }

    public int[] m2(int[] a){
        int[] b = new int[10];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                b[j] = a[i];
                j++;
            }
        }
        b[j]=-1;
        return b;
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        int[] arr = {11,22,33,44,55,66,77,88};
        int[] newArr = test01.m1(arr);
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i]==-1){
                break;
            }
            System.out.println(newArr[i]);
        }

        System.out.println("_____________________");

        int[] jiArr = test01.m2(arr);
        for (int i = 0; i < jiArr.length; i++) {
            if(jiArr[i]==-1){
                break;
            }
            System.out.println(jiArr[i]);
        }
    }
}
