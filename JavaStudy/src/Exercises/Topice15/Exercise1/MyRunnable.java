package Exercises.Topice15.Exercise1;

/**
 * 练习使用线程:编写一个Runnable接口的实现类MyRunnable.然后编写一个程序,
 * 在程序中创建一个MyRunable类的实例,然后使用它创建一个Thread类的实例,最后启动这个线程
 */
//编写一个Runnable接口的实现类MyRunnable
public class MyRunnable implements  Runnable {
    @Override
    public void run() {
        System.out.println("线程开始了");
    }
}
