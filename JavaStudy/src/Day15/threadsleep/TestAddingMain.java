package Day15.threadsleep;

public class TestAddingMain {
    public static void main(final String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TestAdding testAdding = new TestAdding();
                testAdding.giveAddingTest();
            }
        };
        Thread thread = new Thread(runnable,"加法测试线程");
        thread.start();
        System.out.println("主程序结束");
    }
}
