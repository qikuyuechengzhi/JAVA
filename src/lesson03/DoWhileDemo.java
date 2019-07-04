package lesson03;

/**
 * do while 实例
 */
public class DoWhileDemo {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        double num = 50;
        int i = 0;
        do {
            num *= 1.008;
            i++;
        } while (num <= 60);
        System.out.println("需要" + i + "年人口达到60亿!");
        //输出1~100的数字总和
        int sum = 0;
        int j = 1;
        do {
            sum += j;
            j++;
        } while (j <= 100);
        System.out.println(sum);
        //求10 的乘阶
        int k = 10;
        int sub = 1;
        do {
            sub *= k;
            k--;
        } while (k >= 1);
        System.out.println(sub);
    }
}
