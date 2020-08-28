package Day07;

import java.util.Scanner;

public class Exerciess04 {
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
                System.out.println("退出!");
                break;
        }
    }
}
