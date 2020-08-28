package Day07;

public class NestingLoop {
    public static void main(String[] args) {
        int biggerThan = 10051005;
        int n = 0;
        int squareSum = 0;
        while (squareSum <= biggerThan){
            n++;
            squareSum = 0;
            for (int i = 0; i < n; i++){
                    int squareValue = i * i;
                    squareSum += squareValue;
            }
        }
        System.out.println("平方大于立方"+biggerThan+"的最小整数值为:"+n);
    }
}
