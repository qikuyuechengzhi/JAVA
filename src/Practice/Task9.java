package Practice;

import java.util.Scanner;

/**
 * task9  血压测试
 */
public class Task9 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的收缩压:");
        int blood = scanner.nextInt();
        System.out.println("请输入您的舒张压:");
        int blood2 = scanner.nextInt();
        if (blood>=90 && blood<=140){
            if (blood2>=60&&blood2<=90){
                System.out.println("您的血压是正常的.");
            }else if (blood2<60){
                System.out.println("您患有低血压");
            }else if (blood2>90){
                System.out.println("您患有高血压");
            }else {
                System.out.println("舒张压输入有误");
            }
        }else if (blood<90){
            System.out.println("您患有低血压");
        }else if (blood>140){
            System.out.println("您患有高血压");
        }else {
            System.out.println("您的收缩压输入有误");
        }
    }
}
