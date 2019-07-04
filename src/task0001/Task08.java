package task0001;

import java.util.Scanner;

/**
 * task8  接受用户输入两个整形,储存到两个变量中,交换变量储存的值
 */

public class Task08 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //提示用户输入int值
        System.out.println("请第一个整数:");
        int a = scanner.nextInt();
        System.out.println("请第二个整数:");
        int b = scanner.nextInt();
        //临时变量法
        int c = a;
         a = b;
         b = c;

//      求和法
//         a = a + b ;
//         b = a - b ;
//         a = a - b ;

         //异或


    }
}
