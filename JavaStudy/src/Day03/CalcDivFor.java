package Day03;

public class CalcDivFor {
    public static void main(String[] args) {
        int a = 110;
        int b = 3;

        int found = 0;
        int toBeFund = 10;

        for (int i = 0; i < 100; i++){
            if (a % b == 0){
                System.out.println(a+"除"+b+"可以整除\t商为:"+(a/b));
                found ++;
            }
            if (found >= toBeFund){
                System.out.println("已经找到"+toBeFund+"个数,循环退出");
                break;
            }
            a++;
        }
    }
}
