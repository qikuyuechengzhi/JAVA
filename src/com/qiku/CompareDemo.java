package com.qiku;

/**
 *
 */
public class CompareDemo {
    public static void main(String[] args) {
        //&&当两个条件满足的时候为ture
        boolean flag1 = false;
        boolean flag2 = true;
        boolean result = flag1 && flag2;
        System.out.println(result);
        //或运算 || 两个条件满足一个条件时为true
        boolean result2 = flag1 || flag2;
        System.out.println(result2);
        //!:非运算
        boolean result3 =! flag1;
        System.out.println(result3);
        //关系运算符
        int i = 5;
        int j = 6;
        System.out.println("######################################");
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i > j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i >= j);


    }
}
