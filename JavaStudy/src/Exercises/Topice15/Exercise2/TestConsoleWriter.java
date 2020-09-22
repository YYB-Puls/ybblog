package Exercises.Topice15.Exercise2;
//最后,编写一个程序,
public class TestConsoleWriter {

    public static void main(String[] args) {
        //创建一个ConsoleWriter类的实例,
        ConsoleWriter consoleWriter = new ConsoleWriter();

        //启动两个MyWriter类的实例,让它们使用同一个ConsoleWriter类的实例,启动两个MyWriter,查看控制台输出
        MyWriter myWriter1 = new MyWriter();
        MyWriter myWriter2 = new MyWriter();
        myWriter1.start();
        myWriter2.start();
    }


}
