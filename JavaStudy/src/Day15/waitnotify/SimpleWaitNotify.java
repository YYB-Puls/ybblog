package Day15.waitnotify;

public class SimpleWaitNotify {
    public static void main(String[] args) {
        Object object = new Object();
        Waiting waiting = new Waiting(object);
        Notifier notifier = new Notifier(object);
        Thread waitingThread = new Thread(waiting,"挂起线程");
        Thread notifierThread = new Thread(notifier,"唤醒线程");
        waitingThread.start();
        notifierThread.start();
    }
}
