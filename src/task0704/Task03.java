package task0704;

import java.util.Scanner;

/**
 * task03让用户输入学员的成绩，然后输出学员的结业考试成绩评测结果。
 * 成绩 >=90  ： A      
 * 90> 成绩 >=80  ： B  
 * 80> 成绩 >=70  ： C
 * 70> 成绩 >=60  ： D
 * 成绩 <60   ： E
 */
public class Task03 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("欢迎来到学员的结业考试成绩评测系统");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学员的结业考试成绩:");
        int num = scanner.nextInt();
        if (num>=90){
            System.out.println("您的成绩是:A");
        }else if (num<90 && num>=80){
            System.out.println("您的成绩是:B");
        }else if (num<80 && num>=70){
            System.out.println("您的成绩是:C");
        }else if (num<70&&num>=60){
            System.out.println("您的成绩是:D");
        }else if (num<60){
            System.out.println("您的成绩是:E");
        }else {
            System.out.println("您输入的成绩有误!");
        }
    }
}
