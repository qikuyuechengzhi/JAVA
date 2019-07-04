package Practice;

import java.util.Scanner;

/**
 * task1输入月份判断是哪个季节
 */
public class Task1 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //实例化对象监听键盘输入的数据
        Scanner scanner = new Scanner(System.in);
        //提示用户输入月份
        System.out.println("请输入一个月份:");
        //接受输入数据
        int num = scanner.nextInt();
        if (num == 3 || num == 4) {
            System.out.println("您输入的月份是春季");
        } else if (num > 4 && num < 9) {
            System.out.println("您输入的月份是夏季");
        } else if (num == 11 || num == 12 || num == 1 || num == 2) {
            System.out.println("您输入的月份是冬季");
        } else if (num == 9 || num == 10) {
            System.out.println("您输入的月份是秋季");
        } else {
            System.out.println("您输入的月份有误!");
        }
    }
}
