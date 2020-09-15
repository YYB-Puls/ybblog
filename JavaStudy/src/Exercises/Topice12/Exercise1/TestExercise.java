package Exercises.Topice12.Exercise1;

public class TestExercise {
    //然后编写一个程序,分别使用MyImpl1类的实例和MyImpl2类的实例为参数,调用userMyInterface()方法
    public static void main(String[] args) {
        MyImpl1 myImpl1 = new MyImpl1();
        MyImpl2 myImpl2 = new MyImpl2();
        Exercise2 exercise2 = new Exercise2();
        exercise2.useMyInterface(myImpl1);
        exercise2.useMyInterface(myImpl2);
    }
}
