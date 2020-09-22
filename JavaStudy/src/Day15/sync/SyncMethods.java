package Day15.sync;

public class SyncMethods {
    public synchronized static void syncStaticMethod1(){
        System.out.println("这是一个静态的同步方法");
    }
    public synchronized static void syncStaticMethod2(){
        System.out.println("这是一个静态的同步方法");
    }
    public static void staticMethod(){
        System.out.println("这是一个静态方法");
    }
    public synchronized void syncMethod1(){
        System.out.println("这是一个同步方法");
    }
    public synchronized void syncMethod2(){
        System.out.println("这是一个同步方法");
    }
    public void method(){
        System.out.println("这是一个普通方法");
    }
}
