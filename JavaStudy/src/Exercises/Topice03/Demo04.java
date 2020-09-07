package Exercises.Topice03;

/**
 * 4.声明两个double类型的变量a和b和一个boolean类型的变量c
 * 然后给a赋初始值8.0,给b赋初始值9.5,比较a和b的大小,并将
 * 结果赋值给变量c,最后向控制台输出c的值
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        double a = 8.0;
        double b = 9.5;
        boolean c = a==b;
        // todo 比大小不是比相等
        System.out.println("c的值是:"+c);
    }
}
