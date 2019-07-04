package lesson03;

/**
 * while循环练习
 */
public class WhlieDemo {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        //定义变量
        double money = 1000;
        int year = 0;
        while (money<=2000){
            money *= 1.0414;
            year++;
        }
        System.out.println("需要年数:"+year);
    }
}
