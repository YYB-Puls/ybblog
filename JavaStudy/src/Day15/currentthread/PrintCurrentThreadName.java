package Day15.currentthread;

public class PrintCurrentThreadName {
    public void printCurrentThreadName(){
        Thread currentThread = Thread.currentThread();//获取当前的线程
        String threadName = currentThread.getName();//获得当前线程的名字
        System.out.println("执行代码的线程叫做:"+threadName);
    }
}
