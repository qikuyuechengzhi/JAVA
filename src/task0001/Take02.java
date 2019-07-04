package task0001;

/**
 * task2 定义变量,给敌方英雄定义更多的属性值,尽可能多的定义变量.
 */

public class Take02 {
    /**
     * 主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        //给敌方英雄定义属性
        String username = "霸心狂人";
        char gender = '男';
        int undergo = 3600;
        int magic = 800;
        int health = 2500;
        String hero = "诺克萨斯";
        String tricks = "诺克萨斯断头台";
        //打印玩家及英雄属性
        System.out.println("用户名:" + username);
        System.out.println("经验值:" + undergo);
        System.out.println("性别:" + gender);
        System.out.println("魔法值:" + magic);
        System.out.println("血量:" + health);
        System.out.println("擅长英雄:" + hero);
        System.out.println("英雄大招技能:" + tricks);

    }
}
