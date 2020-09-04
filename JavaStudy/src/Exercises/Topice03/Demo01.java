package Exercises.Topice03;

public class Demo01 {
    /**
     * 1.声明两个int类型的变量a和b,然后给a赋初始值2,给b赋初始值7,计算a和b的平方和,最后向控制台输出结果
     * @param args
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = (a*a) + (2*a*b) + (b*b);

        System.out.println("a和b的平方和是:"+c);
    }
}
