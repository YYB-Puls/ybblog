package Exercises.Topice15.Exercise2;
//编写一个Thread类的子类MyWriter类
public class MyWriter extends Thread {
    //覆盖其run()方法并在其中调用ConsoleWriter的writeToConsole()方法
    public void  run(){
        ConsoleWriter consoleWriter = new ConsoleWriter();
        consoleWriter.writeToCOnSole("MyWriter类的run()方法");
    }
}
