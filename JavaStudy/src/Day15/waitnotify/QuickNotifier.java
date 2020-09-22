package Day15.waitnotify;

public class QuickNotifier implements Runnable{
    private Object notifyObj;
    public QuickNotifier(Object notifyObj){
        this.notifyObj = notifyObj;

    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+":开始notify线程");
        synchronized (notifyObj){
            notifyObj.notify();
        }
        System.out.println(name+":notify线程结束");
    }
}
