package Exercises.Topice10;

/**
 * 第10章第1题:
 * 练习方法的覆盖:编写一个名为Parent的类,类中有一个叫method1()和
 * 一个叫method2()的方法,方法内容就是将方法所属的类和方法名输出到控制台
 * 然后编写一个Chil类继承Parent类,让Child类覆盖method1()方法,方法内容也是向
 * 控制台输出方法所属类和方法名
 */
//编写一个名为Parent的类
public class Parent {

    //类中有一个叫method1()和
    //一个叫method2()的方法
    public void method1() {
        //方法内容就是将方法所属的类和方法名输出到控制台
        System.out.println("Parent类的method1()方法被调用了");
    }

    public void method2() {
        //方法内容就是将方法所属的类和方法名输出到控制台
        System.out.println("Parent类的method2()方法被调用了");
    }


   /* public static void main(String[] args) {
        Parent parent = new Parent();
        parent.invokeMethods(parent);
        Child child = new Child();
        child.invokeMethods(child);
        Child2 child2 = new Child2();
        child2.method2();
    }*/
}
