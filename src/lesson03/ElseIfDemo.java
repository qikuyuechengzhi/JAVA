package lesson03;

import java.util.Scanner;

/**
 * 多分支语句
 */

public class ElseIfDemo {
    public static void main(String[] args) {
        //c创建实例化对象Scanner
        Scanner scanner = new Scanner(System.in);
        //提示用户输入数据
        System.out.println("请输入学生分数:");
        String score = scanner.next();
        //把字符串转化成整数
        int num = Integer.parseInt(score);
        //对多分支进行判断
        if (num >= 0 && num <= 100) {
            if (num >= 90 && num <= 100) {
                System.out.println("成绩:" + num + "~~~等级:A");
            } else if (num >= 80 && num < 90) {
                System.out.println("成绩:" + num + "~~~等级:B");
            } else if (num >= 70 && num < 80) {
                System.out.println("成绩" + num + "~~~等级:C");
            } else if (num >= 60 && num < 70) {
                System.out.println("成绩" + num + "~~~等级:D");
            } else {
                System.out.println("成绩" + num + "~~~等级:E");
            }
        } else {
            System.out.println("对不起你输入的分数有误!");
        }
    }
}
