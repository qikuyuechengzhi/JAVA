package task0001;
/**
 * Task10  输入一个整数,,输出结果将整数反序输出
 */

import java.util.Scanner;

public class Task10 {
    /**
     *  
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = in.nextInt();//得到输入的整数
        int sum = 0;
        int i = 1;
        while (n > 0) {//当余数不为0的时候，继续操作
            //除10余数就是个位数
            int d = n % 10;
            sum = sum * 10 + d;
            //此时将n的各位数字剔除,依次少一位,知道n为0  输出结束.
            n = n / 10;
        }
        System.out.println(sum);

    }
}
