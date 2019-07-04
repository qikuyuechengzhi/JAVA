package com.qiku;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建ScannerDemo类对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        //从键盘获取用户输入的数字,并赋值给input变量
        int input = scanner.nextInt();
        //打印用户输入的数字
        System.out.println("您输入的数字是:" + input);
        System.out.println("请输入一个字符串:");
        String ss = scanner.next();
        System.out.println("您输入的字符串是:"+ ss);

    }
}
