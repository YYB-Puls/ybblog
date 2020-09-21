package Day14.whatisexception;

public class Calculator {
   /* public static void divide(String a, String b){
         //aa没有被定义,编译报错
        double valueA = Double.valueOf(aa);
        double valueB = Double.valueOf(b);
        double result = valueA / valueB;
        System.out.println(a+"除以"+b+"的结果是:"+result);
    }*/

    public static void divide(String a, String b){
        double valueA = Double.valueOf(a);
        double valueB = Double.valueOf(b);
        double result = valueA / valueB;
        System.out.println(a+"除以"+b+"的结果是:"+result);
    }
}
