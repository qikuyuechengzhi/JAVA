package task0704;

/**
 * 求1-100间的所有能被3整除的数的和
 */
public class Task07 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                num = num+i;

            }
        }
        System.out.println(num);
    }
}
