package Practice;


import java.util.Scanner;

/**
 * task5
 */
public class Task5 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        //监听键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s =scanner.next();
        int a = s.length();
        if (a>=0 && a<=56){
            System.out.println("短消息");
        }else if (a>=57&&a <=128){
            System.out.println("一般消息");
        }else if (a>=129 && a<=192){
            System.out.println("长消息");
        }else if (a>=193 && a<=256){
            System.out.println("超长消息");
        }else {
            System.out.println("长度超过可发送长度上限");
        }
    }
}
