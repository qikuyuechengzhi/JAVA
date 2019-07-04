package com.qiku;

import java.text.MessageFormat;

public class Demo {
    public static void main(String[] args) {

        String str = MessageFormat.format("姓名:{0},年龄:{1},性别:{2}","张三",22,"男");
        System.out.println(str);
        System.out.printf("%d,%s",18,"test");
        System.out.println();//换行
        System.out.print("\n");
        //String format
        String num = String.format("%.2f",2.111555666);
        System.out.println(num);
    }
}

