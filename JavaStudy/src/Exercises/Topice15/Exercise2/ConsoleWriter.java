package Exercises.Topice15.Exercise2;

/**
 * 15.2
 *      理解多线程运行的非顺序性:编写一个ConsoleWriter类,
 *      类中包含一个writeToConSole的方法,方法接收一个String类型的参数,
 *      然后循环10次向控制台输出"当前线程的名字"和参数字符串的内容,
 *      每次输出后线程让线程沉睡1秒钟,
 *      编写一个Thread类的子类MyWriter类,覆盖其run()方法并在其中调用ConsoleWriter的writeToConsole()方法
 *      最后,编写一个程序,创建一个ConsoleWriter类的实例,启动两个MyWriter类的实例,
 *      让它们使用同一个ConsoleWriter类的实例,启动两个MyWriter,查看控制台输出
 */
//编写一个ConsoleWriter类
public class ConsoleWriter {
    //类中包含一个writeToConSole的方法,方法接收一个String类型的参数,

    /**
     * 15.3
     *     在多线程环境下使用同步控制:将第2题中的writerToConsole()方法改为同步方法,运行程序,查看结果
     * @param s
     */
    public synchronized void writeToCOnSole(String s){
        //然后循环10次向控制台输出"当前线程的名字"和参数字符串的内容,
        for (int i = 0; i < 10; i++){
            System.out.println("当前线程的名字:"+Thread.currentThread().getName()+"\t"+s);
            //每次输出后线程让线程沉睡1秒钟,
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("对不起,程序出错,错误信息:"+e.getMessage());
                return;
            }
        }
        System.out.println("线程结束!");
    }
}
