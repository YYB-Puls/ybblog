package Exercises.Topice03;

public class Demo03 {
    /**
     * 声明两个double类型的变量a和b和一个int类型的变量c.给a赋初始值2.5,给b赋初始值7.5,计算a和b的平方和,并将结果四舍五入后赋值给变量c,
     * 最后向控制台输出c的值;
     */
    public static void main(String[] args) {
        double a = 2.5;
        double b = 7.5;
        double d = (a*a)  + (b*b);
        // todo 需要计算平方和而不是完全平方和
        int c = (int) (d+ 0.5);
        // todo 强制类型转换int的结果只保留整数部分，不是四舍五入
        System.out.println("C的值是"+c);
    }
}
