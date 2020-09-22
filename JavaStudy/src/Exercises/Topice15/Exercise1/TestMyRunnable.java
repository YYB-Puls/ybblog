package Exercises.Topice15.Exercise1;

public class TestMyRunnable {
    //然后编写一个程序
    public static void main(String[] args) {
        //在程序中创建一个MyRunable类的实例
        MyRunnable myRunnable = new MyRunnable();
        //然后使用它创建一个Thread类的实例
        Thread thread = new Thread(myRunnable);
        //最后启动这个线程
        thread.start();
    }
}
