package Day15.usethread;

public class UseMyThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("这是在main()方法中执行的代码");
    }
    /*public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }*/
}
