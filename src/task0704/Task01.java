package task0704;

import java.util.Scanner;

/**
 * task01 让用户输入小茗的语文和数学成绩，输出以下判断是否正确，正确输出true，错误输出false
 */
public class Task01 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小茗的语文成绩:");
        int chinese = scanner.nextInt();
        System.out.println("请输入小茗的数学成绩:");
        int math = scanner.nextInt();
        if (chinese > 90 && math > 90) {
            System.out.println("成绩很好!nice!");
        } else if (chinese > 90 || math > 90) {
            System.out.println("成绩有点不稳定.");
        }
    }
}
