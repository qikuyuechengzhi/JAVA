package task0001;

import java.util.Scanner;

/**
 * 编写控制台应用程序,要求用户输入四个int值,并显示他们的乘积
 */
public class Task04 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("欢迎光临,请根据提示输入四个整数,我们会根据您输入的整数自动算出他们的乘积!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        //创建Scanner类对象
        Scanner scanner = new Scanner(System.in);
        //提示用户输入int值
        System.out.println("请输入第一个整数:");
        int input1 = scanner.nextInt();
        System.out.println("请输入第二个整数:");
        int input2 = scanner.nextInt();
        System.out.println("请输入第三个整数:");
        int input3 = scanner.nextInt();
        System.out.println("请输入第四个整数:");
        int input4 = scanner.nextInt();
        //乘法运算
        int mul = input1 * input2 * input3 * input4;
        System.out.println("您输入的四个整数的乘积是:" + mul);

    }
}
