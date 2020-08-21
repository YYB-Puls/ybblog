package Day03;

public class IfElseBaoZi {
    public static void main(String[] args) {
        int BaoZi = 3;
        boolean BaoziGangcchulong = true;

        if (BaoziGangcchulong) {
            BaoZi += 2;
            System.out.println("包子刚出笼多买了两个包子,一共买了" + BaoZi + "个包子");
        } else {
            System.out.println("包子不是刚出笼,只买了" + BaoZi + "个包子");
        }
    }
}
