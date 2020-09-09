package Exercises.Topice10;

/**
 * 第10章习题3:
 *  在第一题的基础上,编写一个Child2类,覆盖Parent类的method2()方法,然后编写一个程序,
 *  使用Child2类的实例调用invokeMethods()方法
 */
public class Child2 extends Parent{
    public void method2(){
        System.out.println("Child2类的method2()方法被调用了");
    }
}
