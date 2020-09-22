package Day15.currentthread;

public class CurrentThreadMianII {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                PrintCurrentThreadName printCurrentThreadName = new PrintCurrentThreadName();
                printCurrentThreadName.printCurrentThreadName();
            }
        };
        Thread thread = new Thread(runnable,"线程-1");
        thread.start();
    }
}
