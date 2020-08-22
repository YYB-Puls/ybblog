package Day04;

public class Scanner {
    public static void main(String[] args) {
        int a ;
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("给a赋值,输入一个整数");
        a = in.nextInt();
        System.out.println("a的值是:"+a+"再个a赋值");
        a = in.nextInt();
        System.out.println("a的值是:"+a);
    }
}
