package com.qiku;

/**
 * for 循环练习
 */
public class ForDemo {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //for循环的实现
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //1~100 的和计算代码
        int sum = 0;
        for (int j = 1; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println("0~100的和是:" + sum);
    }
}
