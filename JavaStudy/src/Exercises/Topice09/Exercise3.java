package Exercises.Topice09;

/**
 * 给出下面代码的运行结果
 * public class Exercise3 {
 *     public static void main(String[] args) {
 *         String str = "OOPS";
 *         noUse(str);
 *         System.out.println(str);
 *     }
 *     public static void noUse(String str){
 *         str = "O" + str;
 *     }
 * }
 *
 *
 * 结果为:  OOPS
 */
public class Exercise3 {
    public static void main(String[] args) {
        String str = "OOPS";
        noUse(str);
        System.out.println(str);
    }
    public static void noUse(String str){
        str = "O" + str;
    }
}
