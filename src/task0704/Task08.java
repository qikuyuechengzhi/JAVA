package task0704;

/**
 * 编程实现如下图列出的图形。
 * *
 * ***
 * *****
 * *******
 */
public class Task08 {
    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        for (int i= 1;i<=4;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
