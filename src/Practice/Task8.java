package Practice;

import java.util.Scanner;

/**
 * task8
 */
public class Task8 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的年龄:");
        int age = scanner.nextInt();
        if (age > 18) {
            System.out.println("尊敬的用户您可以查看啦");
        } else if (age < 10) {
            System.out.println("年龄太小,不可查看");
        } else if (age >= 10 & age <= 18) {
            System.out.println("是否继续查看,请输入yes or no :");
            String look = scanner.next();
            switch (look) {
                case "yes":
                    System.out.println("你可以查看啦");
                    break;
                case "no":
                    System.out.println("系统即将退出");
                    break;
                default:
                    System.out.println("您的输入有误!");
            }
        }
    }
}
