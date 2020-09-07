package Exercises.Topice03;

public class Demo02 {
    /**
     * 2.声明两个double类型的变量a和b,然后给a赋初始值2.5,给b赋初始值7.5,计算a和b的平方和,最后向控制台输出结果
     * @param args
     */
    public static void main(String[] args) {
        double a = 2.5;
        double b = 7.5;
        double c = (a*a)  + (b*b);
        // todo 需要计算平方和而不是完全平方和
        System.out.println("a和b的平方和是:"+c);
    }
}
