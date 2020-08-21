package Day03;

public class CalcDivFor {
    public static void main(String[] args) {
        int a = 100;
        int b = 3;

        for (int i = 0; i < 100; i++){
            if (a % b == 0){
                System.out.println(a+"除"+b+"可以整除\t"+(a/b));
            }
            a++;
        }
    }
}
