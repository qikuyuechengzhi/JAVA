package Practice;

import java.util.Scanner;

/**
 * task7  欢迎来到课堂提问环节,
 */
public class Task7 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("这道路会做了吗?请回答y or n");
        //监听键盘信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的答案:");
        String s = scanner.next();
        switch (s){
            case "y":
                System.out.println("同学们可以放学啦!");
                break;
            case "n":
                System.out.println("再讲一遍这道题!");
                break;
            default:
                System.out.println("你输入的选项有误!");
                break;
        }

    }
}
