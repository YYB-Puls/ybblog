package Exercises.Topice04;


import java.util.Scanner;

/**
 * 编写一个商场用来计算优惠劵的程序:创建一个变量totalCost表示用户消费金额
 * 给totalCost赋值后,使用if-else语句计算客户可以获得的优惠劵,计算规则为:
 * 当前消费金额大于等于200,小于300的时候,可获得20元优惠劵
 * 当前消费金额大于等于300,小于500的时候,可获得50元优惠劵
 * 当前消费大于等于500,可以获得100元打折卡
 */
public class Demo01 {
    public static void main(String[] args) {
        int totalCost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费的金额");
        //todo 注意审题，if else语句而不是if
        int consume = scanner.nextInt();
        if (consume >= 200 && consume < 300) {
            totalCost = consume - 20;
            System.out.println("恭喜您获得20元优惠劵总消费为:" + totalCost);
        }else if (consume >= 300 && consume < 500){
                totalCost = consume - 50;
                System.out.println("恭喜您获得50元优惠劵总消费为:" + totalCost);
        }else if (consume >= 500) {
            totalCost = consume - 100;
            System.out.println("恭喜您获得100元优惠劵,总消费为:" + totalCost);
        }else if (consume < 200) {
            totalCost = consume;
            System.out.println("很遗憾您没有获得优惠劵总消费为:" + totalCost);
        }
    }
}
