package Day15.usethread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("这是在另一个线程中执行的代码.");
    }
}
