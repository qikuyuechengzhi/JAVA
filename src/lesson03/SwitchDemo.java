package lesson03;

import java.util.Scanner;

/**
 * switch 用法实践
 */
public class SwitchDemo {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //实例化对象检测键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1~7之间的数字:");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("今天是星期一");
                break;
            case 2:
                System.out.println("今天是星期二");
                break;
            case 3:
                System.out.println("今天是星期三");
                break;
            case 4:
                System.out.println("今天是星期四");
                break;
            case 5:
                System.out.println("今天是星期五");
                break;
            case 6:
                System.out.println("今天是星期六");
                break;
            case 7:
                System.out.println("今天是星期日");
                break;

            default:
                System.out.println("输入错误!");
                break;
        }
    }
}
