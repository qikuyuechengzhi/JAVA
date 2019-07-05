package task0704;

import java.util.Scanner;

/**
 * task02 要求用户输入两个数a、b，如果 a 被 b 整除或者a加b大于100，则输出a的值，否则输出 b 的值
 */
public class Task02 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = scanner.nextInt();
        if (num1 % num2 == 0 || (num1 + num2) == 100) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
