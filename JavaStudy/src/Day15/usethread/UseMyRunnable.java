package Day15.usethread;

public class UseMyRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("这是在另一个线程中执行的代码");
            }
        });
        thread.start();

    }
    /*public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }*/
}
