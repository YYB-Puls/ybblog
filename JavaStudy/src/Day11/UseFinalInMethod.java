package Day11;

public class UseFinalInMethod {
    public final void finalMethod(){
        System.out.println("这是一个使用final修饰的方法");
    }

    public static void staticMethod(){
        final int a = 9;

    }
    public void commonMethod(){
        System.out.println("这是一个没有使用final修饰的方法");
        final int a = 9;
    }
}
