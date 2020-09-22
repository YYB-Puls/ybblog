package Day15.threadsleep;

public class TestAdding {
    public void giveAddingTest(){
        int a = (int )(100 * Math.random());
        int b = (int )(100 * Math.random());
        System.out.println("请在5秒内计算出下面两个整数的和:"+a+"+"+b);
        String currThreadName = Thread.currentThread().getName();
        System.out.println("线程的名字叫做:"+currThreadName);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("对不起,程序运行出错,错误信息:"+e.getMessage());
            return;
        }
        int result = a + b;
        System.out.println(a+"+"+b+"的运算结果是:"+result);
    }
}
