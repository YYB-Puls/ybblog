package Day15.threadsleep;

public class TestAddingInMain {
    public static void main(String[] args) {
        int a = (int )(100 * Math.random());
        int b = (int )(100 * Math.random());
        System.out.println("请在5秒内计算出下面两个整数的和:"+a+"+"+b);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("对不起,程序运行出错,错误信息:"+e.getMessage());
            return;
        }
        int result = a + b;
        System.out.println(a+"+"+b+"的运算结果是:"+result);
    }
}
