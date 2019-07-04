package Practice;

import java.util.Scanner;

/**
 * task10 商店购物某商店T恤的价格为35元/件（2件9折，3件以上8折）,裤子的价格为120元/条（2条以上9折）.小明在该店买了3件T恤和2条裤子,请计算并显示小明应该付多少钱?
 */
public class Task10 {
    /**
     * 主程序
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("某商店T恤的价格为35元/件（2件9折，3件以上8折）,裤子的价格为120元/条");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要购买几件t恤:");
        int amount = scanner.nextInt();
        System.out.println("请输入要购买几条裤子");
        int amount2 = scanner.nextInt();
        if (amount == 1) {
            if (amount2 <= 2) {
                double sum = 35 + amount2 * 120;
                System.out.println("您需要支付:" + sum + "元");
            } else if (amount2 > 2) {
                double sum = 35 + amount2 * 120 * 0.9;
                System.out.println("您需要支付:" + sum + "元");
            } else {
                System.out.println("输入的数量有误");
            }
        } else if (amount == 2) {
            if (amount2 <= 2) {
                double sum = 35 * 2 * 0.9 + amount2 * 120;
                System.out.println("您需要支付:" + sum + "元");
            } else if (amount2 > 2) {
                double sum = 35 * 2 * 0.9 + amount2 * 120 * 0.9;
                System.out.println("您需要支付:" + sum + "元");
            } else {
                System.out.println("输入的数量有误");
            }
        } else if (amount >= 3) {
            if (amount2 <= 2) {
                double sum = 35 * amount * 0.8 + amount2 * 120;
                System.out.println("您需要支付:" + sum + "元");
            } else if (amount2 > 2) {
                double sum = 35 * amount * 0.8 + amount2 * 120 * 0.9;
                System.out.println("您需要支付:" + sum + "元");
            } else {
                System.out.println("输入的裤子数量有误");
            }
        } else {
            System.out.println("您输入的t恤数量有误");
        }

    }
}
