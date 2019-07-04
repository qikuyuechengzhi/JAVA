package task0001;

import java.util.Scanner;

/**
 * task07 指定计算天数是是第几周第几天
 */

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //提示用户输入数据
        System.out.println("请输入一个天数:");
        int day = scanner.nextInt();
        int remainder = day % 7;
        int week = (day-remainder)/7 ;
        System.out.println("您输入的天数是"+week+"周零"+remainder+"天.");
    }
}
