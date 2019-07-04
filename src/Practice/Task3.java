package Practice;

import java.util.Scanner;

/**
 * task3 计算器小程序
 */
public class Task3 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘的数据
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("欢迎使用计算器小程序");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("请输入第一个数:");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数:");
        int num2 = scanner.nextInt();
        System.out.println("请输入一个运算符+ - * /");
        String symbol = scanner.next();
        switch (symbol) {
            case "+":
                int a = num1 + num2;
                System.out.println("计算的结果为:" + a);
                break;
            case "-":
                int b = num1 - num2;
                System.out.println("计算结果为:" + b);
                break;
            case "*":
                int c = num1 * num2;
                System.out.println("计算结果为:" + c);
                break;
            case "/":
                int d = num1 / num2;
                System.out.println("计算结果为:" + d);
                break;
            default:
                System.out.println("对不起,您的输入有误");
                break;
        }
    }
}
