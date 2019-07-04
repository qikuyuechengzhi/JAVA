package Practice;

import java.util.Scanner;

/**
 *task6
 */
public class Task6 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘输入数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入0~5之间的一个数字");
        int num = scanner.nextInt();
        switch (num){
            case 0:
                System.out.println("进入战斗");
                break;
            case 1:
                System.out.println("捡到宝箱");
                break;
            case 2:
                System.out.println("捡到武器");
                break;
            case 3:
                System.out.println("捡到弹药");
                break;
            case 4:
                System.out.println("踩到陷阱");
                break;
            case 5:
                System.out.println("安然无恙");
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }
}
