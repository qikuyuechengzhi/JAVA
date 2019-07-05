package task0704;

import java.util.Scanner;

/**
 * task4提示用户输入用户名，然后再提示输入密码，
 * 如果用户名是“admin”并且密码是“88888”，则提示正确，
 * 否则，如果用户名不是admin还提示用户用户名不存在,
 * 如果用户名是admin则提示密码错误。
 */
public class Task04 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("请输入用户名:");
            String name = scanner.next();
            if (name.equals("admin")){
                System.out.println("用户名正确");
                break;
            }else {
                System.out.println("用户名输入有误!");
                continue;
            }
        }

        while (true){
            System.out.println("请输入密码:");
            String password = scanner.next();
            if (password.equals("admin")){
                System.out.println("密码正确");
                break;
            }else {
                System.out.println("密码输入有误!");
                continue;
            }
        }
        System.out.println("谢谢使用");
    }
}
