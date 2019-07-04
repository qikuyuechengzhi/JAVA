package lesson03;

import java.util.Scanner;

/**
 * if 案例
 */
public class IfElse {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //创建键盘输入实例化对象

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字;");
        //从键盘录入数据
        int num= scanner.nextInt();
        //判断输入的数字是否在0-100之间
        if (num>0 && num <= 100) {
            //判断当前分数是否过60分
            if (num >60){
                System.out.println("恭喜你,你及格啦");

            }
            else {
                System.out.println("很遗憾,成绩不及格,需要重修");
            }
        }
        else {
            System.out.println("输入错误!");
        }
    }
}
