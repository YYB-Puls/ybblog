package Exercises.Topice04;

import java.util.Scanner;

public class Demo04 {
    /**
     * 编写一个输出汉语数字的程序:使用switch语句,对于int变量n(其值应该大于等于0,小于等于10),输出其对应的汉语数字
     * (零壹贰叁肆伍陆柒捌玖拾).比如,当n的值为5的时候,程序应该向控制台输出"伍"
     */
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字:");
            int n = scanner.nextInt();
            switch (n){
                case 0 :
                    System.out.println("零");
                    break;
                case 1 :
                    System.out.println("壹");
                    break;
                case 2 :
                    System.out.println("贰");
                    break;
                case 3 :
                    System.out.println("叁");
                    break;
                case 4 :
                    System.out.println("肆");
                    break;
                case 5 :
                    System.out.println("伍");
                    break;
                case 6 :
                    System.out.println("陸");
                    break;
                case 7 :
                    System.out.println("柒");
                    break;
                case 8 :
                    System.out.println("捌");
                    break;
                case 9 :
                    System.out.println("玖");
                    break;
                case 10 :
                    System.out.println("拾");
                    break;
                default:
                    System.out.println("小于0,大于10,退出!");
                    break;
            }

    }
}
