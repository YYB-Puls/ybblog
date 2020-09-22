package Day15.waitnotify;

public class ErrorSequence {
    public static void main(String[] args) {
        Object object = new Object();
        Waiting waiting = new Waiting(object);
        QuickNotifier quickNotifier = new QuickNotifier(object);
        Thread waitinThread = new Thread(waiting,"挂起线程");
        Thread quickNotifierThread = new Thread(quickNotifier,"唤醒线程");
        quickNotifierThread.start();
        waitinThread.start();
    }
}
