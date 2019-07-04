package lesson03;

import java.util.Scanner;

/**
 * 模拟登陆系统
 */
public class Login {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        //打印登陆页面信息
        System.out.println("~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~");
        System.out.println("欢迎来到奇酷用户用户登陆注册系统");
        System.out.println("[1]用户登陆");
        System.out.println("[2]用户注册");
        System.out.println("[0]退出系统");
        System.out.println("请根据系统提示做出相应的操作.");
        System.out.println("~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~~*~");
        //创建实例化对象监控键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你需要操作的选项:");
        int num = scanner.nextInt();
        //String user="admin";
        //String password="admin";
        //判断用户输入的选项
        if (num == 1){
            //提示用户输入信息
            System.out.println("欢迎您来到登陆系统!");
            System.out.println("请输入用户名:");
            String username = scanner.next();
            System.out.println("请输入用户密码:");
            String passwords=scanner.next();
            //判断用户输入的信息
            if (username.equals("admin") && passwords.equals("admin")){
                System.out.println("恭喜您,登陆成功!祝您玩的愉快!");
            }else {
                System.out.println("您输入的用户名或密码有误!");
            }
        }else if (num == 2){
            System.out.println("欢迎来到玩家注册系统!");
        }else if (num == 0){
            System.out.println("退出系统!");
        }else {
            System.out.println("对不起,您输入的操作有误!");
        }

    }
}
