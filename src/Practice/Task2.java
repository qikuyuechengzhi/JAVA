package Practice;

import java.util.Scanner;

/**
 * task 2  输入小强的英语和语文  判断是否正确
 */
public class Task2 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //实例化类监听键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入小强的数学成绩:");
        int mathNum = scanner.nextInt();
        System.out.println("请输入小强的语文成绩:");
        int chineseNum = scanner.nextInt();
        System.out.println("请输入小强的英语成绩:");
        int englishNum = scanner.nextInt();
        if (mathNum > 85 && chineseNum > 85 && englishNum > 85) {
            System.out.println("你很棒,成绩都很好");
        } else if (mathNum > 95 || chineseNum > 95 || englishNum > 95) {
            System.out.println("有强项科目加油!");
        } else if (chineseNum > 90 || englishNum > 90 && mathNum > 80) {
            System.out.println("成绩有点不均衡啊");
        } else {
            System.out.println("成绩有待提高,加油!");
        }
    }
}
