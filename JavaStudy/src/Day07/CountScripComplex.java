package Day07;


import java.util.Scanner;

public class CountScripComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //结账员需要接待顾客的次数
        int serveTime = 0;
        //存放一次结账的总消费金额
        int totalCoat = 0;
        //在结账过程中,用来存放是否还有商品要结算.1为有,其他值没有
        int hasMoreGoods = 0;
        System.out.println("请输入结账员需要接待的顾客次数:");
        serveTime = scanner.nextInt();

        for (int i = 0; i < serveTime; i++){
            totalCoat = 0;
            do {
                System.out.println("请输入商品的单价:");
                int price = scanner.nextInt();
                if (price < 0 ){
                    System.out.println("商品单价不能小于0");
                    hasMoreGoods = 1;
                    continue;
                }
                System.out.println("请输入商品数量:");
                int amout = scanner.nextInt();
                if (amout < 0){
                    System.out.println("商品数量不能小于0");
                    hasMoreGoods = 1;
                    continue;
                }
                totalCoat = totalCoat + price * amout;
                System.out.println("总价为:    "+totalCoat);
            } while (hasMoreGoods == 1);
            System.out.println("本次消费金额为:"+totalCoat);
            System.out.println("谢谢本次光临,欢迎下次再来!");

        }

        System.out.println("已结算结束!");

    }
}
