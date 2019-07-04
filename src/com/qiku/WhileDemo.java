package com.qiku;

import java.util.Scanner;

/**
 * 游戏对战
 */
public class WhileDemo {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        //战斗回合制
        //玩家:2 武器  3. 生命值 4 战斗力
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩家1的名称");
        String username = scanner.next();
        System.out.println("请输入玩家2的名称:");
        String username2 = scanner.next();
        System.out.println("请输入玩家1的武器:");
        String wq1 = scanner.next();
        System.out.println("请输入玩家2的武器:");
        String wq2 = scanner.next();
        double hp1 = 100;//生命值
        double hp2 = 100;//生命值
        double atk = 10;//攻击力
        int num = 1;
        while (true) {
            if (hp1 <= 0) {
                System.out.println("玩家:" + username + "死亡");
                break;
            }
            if (hp2 <= 0) {
                System.out.println("玩家" + username2 + "死亡");
                break;
            }
            System.out.println("第" + num + "回合,战斗开始");
            hp2 = hp2 - atk;
            System.out.println("玩家:" + username + "使用" + wq1 + "对玩家" + username2 +
                    "进行了攻击消耗了生命值:" + atk + "玩家剩余生命值:" + hp2);
            hp1 = hp1 - atk;
            System.out.println("玩家:" + username2 + "使用" + wq2 + "对玩家" + username +
                    "进行了攻击消耗了生命值:" + atk + "玩家剩余生命值:" + hp1);
            num++;

        }
    }
}
