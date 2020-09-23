package Exercises.Topice15.Exercise2;
//编写一个Thread类的子类MyWriter类
public class MyWriter extends Thread {
    private String s;
    private ConsoleWriter consoleWriter;

    public MyWriter(ConsoleWriter consoleWriter ,String s){
        this.consoleWriter = consoleWriter;
        this.s = s;
    }

    //覆盖其run()方法并在其中调用ConsoleWriter的writeToConsole()方法
    public void  run(){
        consoleWriter.writeToCOnSole(s);
    }
}
