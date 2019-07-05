package task0704;

/**
 * 任务6：
 * 求1-100间的所有奇数和
 */
public class Task06 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
