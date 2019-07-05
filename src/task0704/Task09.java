package task0704;

/**
 * *******       
 * ******        
 * *****          
 * ****           
 * ***            
 * **             
 * * 
 */
public class Task09 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j = j - 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
