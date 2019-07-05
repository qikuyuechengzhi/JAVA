package task0704;

/**
 *  鸡兔同笼，从上面看有35个头，从下面看有94只脚，请问鸡有几只，兔有几只？
 */
public class Task12 {
    public static void main(String[] args) {
        int x,y;
        for (x=0;x<=35;x++){
            y = 35 -x;
            if (2*x+4*y==94){
                System.out.println("鸡有:"+x+"只"+"  "+"鸭有:"+y+"只");
            }
        }
    }

}
