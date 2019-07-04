package task0001;

import java.util.Scanner;

/**
 * task5  用户输入语文,数学,英语,三门课程,分别显示
 */

public class Task05 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("欢迎来到奇酷成绩录入系统!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        //创建Scanner类对象
        Scanner scanner = new Scanner(System.in);
        //提示用户输入int值
        System.out.println("请输入您的姓名:");
        String input1 = scanner.next();
        System.out.println("请输入您的语文成绩:");
        int input2 = scanner.nextInt();
        System.out.println("请输入您的数学成绩:");
        int input3 = scanner.nextInt();
        System.out.println("请输入您的英语成绩:");
        int input4 = scanner.nextInt();
        //乘法运算
        int sum = input2 + input3 + input4;
        double mean = sum / 3;
        System.out.println("您好," + input1 + "同学" + "," + "您的总成绩为:" + sum + "*****" + "平均成绩为:" + mean);

    }
}
