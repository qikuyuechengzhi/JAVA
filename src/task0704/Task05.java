package task0704;

import java.util.Scanner;

/**
 * 提示用户输入用户名，然后再提示输入密码，
 * 如果用户名是“admin”并且密码是“88888”，则提示正确，
 * 否则，提示用户“用户名或者密码错误”，但如果错误达到3次，
 * 则提示用户"您的账户已被冻结"，退出程序
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0 ;
        a= 0;
        while (true){
            System.out.println("请输入用户名:");
            String name = scanner.next();
            if (name.equals("admin")){
                System.out.println("用户名正确");
                break;
            }else {
                System.out.println("用户名输入有误!");
                a++;
                if (a>=3){
                    System.out.println("您输入错误次数太多,账号将被冻结,系统即将退出!");
                    System.exit(0);
                }else {
                    System.out.println("请重新输入!");
                }
                continue;
            }
        }

        while (true){
            System.out.println("请输入密码:");
            String password = scanner.next();
            if (password.equals("888888")){
                System.out.println("密码正确");
                break;
            }else {
                System.out.println("密码输入有误!");
                a++;
                if (a>=3){
                    System.out.println("您输入错误次数太多,账号将被冻结,系统即将退出!");
                    System.exit(0);
                }else {
                    System.out.println("请重新输入!");
                }
                continue;
            }
        }
        System.out.println("谢谢使用");
    }
}
