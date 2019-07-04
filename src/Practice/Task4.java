package Practice;

import java.util.Scanner;

/**
 * task4  输入两个数,,如果第一个数,比大小
 */
public class Task4 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘的数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = scanner.nextInt();
        if (num1 >num2){
            System.out.println("两次输入最大的数是num1为:"+num1);
        }else if (num1<num2){
            System.out.println("两次输入最大的数是num2为:"+num2);
        }else {
            System.out.println("两个数竟然一样啦,不可思议");
        }
    }
}
