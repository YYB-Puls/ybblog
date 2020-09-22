package Day15.waitnotify;

public class Notifier implements Runnable {
    private Object notifyObj;
    public Notifier(Object notifyObj){
        this.notifyObj = notifyObj;

    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+":将挂起5秒钟");
        try {
            Thread.sleep(5000);

        }catch (InterruptedException e){
            System.out.println("对不起,程序运行出错,错误信息为:"+e.getMessage());
            return;
        }
        System.out.println(name+":开始notify线程");
        synchronized (notifyObj){
            notifyObj.notify();
        }
        System.out.println(name+":notify线程结束");
    }
}
