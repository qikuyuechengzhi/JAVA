package task0704;

/**
 *    *              
 *   ***        
 *  *****    
 * *******
 */
public class Task10 {
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        for (int i= 1;i<=4;i++){
            for (int j= 3;j>=i;j--){
                System.out.print(" ");
            }
            for (int x=1;x<=i*2-1;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
