package Day07;

import java.util.Scanner;

public class Exerciess01 {
    public static void main(String[] args) {
        int totalCost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费的金额");
        int consume = scanner.nextInt();
        if (consume >= 200 && consume < 300){
            totalCost =consume - 20;
            System.out.println("恭喜您获得20元优惠劵总消费为:"+totalCost);
        }if (consume >= 300 && consume < 500){
            totalCost = consume - 50;
            System.out.println("恭喜您获得50元优惠劵总消费为:"+totalCost);
        }if (consume >= 500){
            totalCost =  consume - 100;
            System.out.println("恭喜您获得100元优惠劵,总消费为:"+totalCost);
        }if (consume < 200){
            totalCost = consume;
            System.out.println("很遗憾您没有获得优惠劵总消费为:"+totalCost);
        }
    }
}
