package task0001;

import java.util.Scanner;

/**
 * task3  提示用户输入籍贯,当用户输入籍贯时,系统提示欢迎某某
 */
public class Task03 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("欢迎进入奇酷信息录入系统");
        System.out.println("*~**~**~**~**~**~**~**~**~**~**~**~**~*");
        //创建Scanner类对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        String name = scanner.next();
        System.out.println("请输入您的籍贯:");
        String address = scanner.next();
        System.out.println("尊敬的" + name + "," + "欢迎来到美丽的" + address);

    }
}
