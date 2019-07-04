package task0001;

import java.util.Scanner;

/**
 * task6 计算梯形面积
 */
public class Task06 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("欢迎来到梯形面积计算程序");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        //提示用户输入数据
        System.out.println("请输入梯形的上底:");
        int input1 = scanner.nextInt();
        System.out.println("请输入梯形的下底:");
        int input2 = scanner.nextInt();
        System.out.println("请输入梯形的高度:");
        int input3 = scanner.nextInt();
        int area = (input1+input2)*input3 ;
        int area2 = area/2 ;
        System.out.println("梯形的面积为:"+area2);



    }
}
