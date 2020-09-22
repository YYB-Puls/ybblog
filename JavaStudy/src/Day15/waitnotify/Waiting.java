package Day15.waitnotify;

public class Waiting implements Runnable {
    private Object waitObj;
    public Waiting(Object waitObj ){
        this.waitObj = waitObj;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+":线程将进入挂起状态,等待被别的线程唤醒......");
        try {
            synchronized (waitObj){
                waitObj.wait();
            }
        }catch (InterruptedException e){
            System.out.println("对不起,程序出错,错误信息为:"+e.getMessage());
            return;
        }
        System.out.println(name+":线程被唤醒了");

    }
}
