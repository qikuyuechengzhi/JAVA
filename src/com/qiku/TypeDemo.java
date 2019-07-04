package com.qiku;

import java.awt.color.ICC_Profile;
import java.util.InputMismatchException;

/**
 * 数据类型转换
 */
public class TypeDemo {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        int age = 18;
        double num ;
        num = age ; //直接赋值给double类型,自动转换
        //强制类型转换
        age = (int)num ;
        char ch = 'a' ;
        int cc = ch ;
        //把int转化成char类型
        cc = 122 ;
        ch = (char)cc ;
        System.out.println(ch);

        //把整型转换成字符串
        System.out.println(5 + "aaa");
        int i = 5 ;
        //string 类的value(type)方法,可以吧所有的基本数据类型转化成String类型
        String str = String.valueOf(i);
        System.out.println("把整型转化成字符串类型:" + str);
        String nn = "123";
        System.out.println(i + nn);
        //把字符串转化成整型
        int nnn = Integer.parseInt(nn);
        System.out.println("把字符串转化成整型:" + (i + nnn));


    }
}
