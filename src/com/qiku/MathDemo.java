package com.qiku;

import java.security.MessageDigest;

/**
 * 数学函数测试类
 */
public class MathDemo {
    /**
     * 主函数
     */
    public static void main(String[] args) {
        /**
         * 程序入口
         */
        int i = 5 ;//声明整数
        int j = 10 ;//声明整型变量

        //加法运算
        int sum = i + j ;
        //打印输出结果
        System.out.println(i + "+" + j + "=" + sum);
        //减法运算
        int sub = i - j ;
        //打印输出结果
        System.out.println(i + "-" + j + "=" + sub);
        //乘法运算
        int mul = i * j ;
        //打印输出结果
        System.out.println(i + "*" + j + "=" + mul);
        //除法运算
        int div = i / j ;
        //打印输出结果
        System.out.println(i + "/" + j + "=" + div);
        //自增运算
        int a = i++ ;//先赋值在运算
        System.out.println(a + "i=" + i);
        int b = ++j ;//先运算在赋值
        System.out.println(b + "j=" + j);

        //赋值运算
        int n = 1 ;
        int m = 4 ;
        n += 1 ;
        m = n + 1 ;
        m %= 2 ;
        m = m % 3 ; //除以2之后取余数
        System.out.println("3 % 2 =" + m);


    }
}
