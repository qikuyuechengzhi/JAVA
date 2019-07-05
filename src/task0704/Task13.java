package task0704;

import java.util.Scanner;

/**
 * 玩家进来以后要买筹码；
 * 在每次掷骰子前，
 *     要下注（50~手里剩余的筹码）;
 *     接着要选择买大小；
 *     程序要模仿掷骰子，产生一个1~6的随机数
 *     根据掷骰子的结果，判断玩家的输赢，改变玩家的手里的筹码
 *         如果买大，4~6是赢，1~3是输
 *         如果小，1~3是赢，4~6是输
 *         如果赢了，玩家的筹码+=下注金额
 *         如果输了，玩家的筹码-=下注金额    
 *     提示玩家是否要退出游戏
 *     玩家手里的筹码小于最小下注金额，要强制玩家退出
 * 注意 ：先理清楚思路，从宏观上考虑流程，不要考虑每个步骤的细节。流程搞清楚以后，再琢磨每个步骤的细节。然后写代码
 */
public class Task13 {
    public static void main(String[] args) {
        //定义玩家默认筹码
        int chip = 50;
        while (true){
            if (chip>0){
                Scanner scanner = new Scanner(System.in);
                System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~[欢迎来到奇酷小游戏]~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~[筛子大战,欢迎下注,买定离手!]~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~[输入1. 选择大 下注大]*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~[输入2. 选择小 下注小]*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~[输入0. 结束游戏 玩家将退出系统]*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("请输入您需要的选项:");
                int choice = scanner.nextInt();
                if (choice==1){
                    System.out.println("请输入下注金额:");
                    int pour = scanner.nextInt();
                    int num = (int) (Math.random() * 6 );
                    if (num==4||num==5||num==6){
                        System.out.println("恭喜您获胜啦,您可以得到奖励啦!");
                        System.out.println("您当前的金币剩余:"+(chip+=pour));
                        continue;
                    }else if (num==1||num==2||num==3){
                        System.out.println("很遗憾您输啦,您要扣除金币!");
                        System.out.println("您当前的金币剩余:"+(chip-=pour));
                        continue;
                    }else {
                        System.out.println("您输入了不合法的金额!");
                    }
                }else if (choice==2){
                    System.out.println("请输入您要下注的金额:");
                    int pour = scanner.nextInt();
                    int num = (int) (Math.random() * 6 );
                    if (num==1||num==2||num==3){
                        System.out.println("恭喜您获胜啦,您可以得到奖励啦!");
                        System.out.println("您当前的金币剩余:"+(chip+=pour));
                        continue;
                    }else if (num==3||num==4||num==5){
                        System.out.println("很遗憾您输啦,您要扣除金币!");
                        System.out.println("您当前的金币剩余:"+(chip-=pour));
                        continue;
                    }else {
                        System.out.println("您输入了不合法的金额!");
                        continue;
                    }
                }else if (choice==0){
                    System.out.println("谢谢光临,欢迎下次再来");
                    System.exit(0);
                }else {
                    System.out.println("您输入的选项有误!");
                }
            }else {
                System.out.println("金币不足请充值后再来玩耍!");
                System.exit(0);
            }
        }
    }
}
