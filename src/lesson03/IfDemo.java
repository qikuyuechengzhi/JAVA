package lesson03;

/**
 * if 语句测试
 */
public class IfDemo {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //需求,当玩家还活着的时候寄开始攻击
        double blondValue = 49;
        if (blondValue > 50) {
            System.out.println("玩家进行了大杀伤力的攻击");
        }
        int level = 3;//玩家等级
        //当玩家的等级大于等于3时,才能刷vip副本
        if (level >= 3) {
            System.out.println("进入vip副本专区");
        }

    }
}
