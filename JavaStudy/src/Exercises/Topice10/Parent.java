package Exercises.Topice10;

/**
 * 第10章第1题:
 * 练习方法的覆盖:编写一个名为Parent的类,类中有一个叫method1()和
 * 一个叫method2()的方法,方法内容就是将方法所属的类和方法名输出到控制台
 * 然后编写一个Chil类继承Parent类,让Child类覆盖method1()方法,方法内容也是向
 * 控制台输出方法所属类和方法名
 */
public class Parent {

    public void method1(){
        System.out.println("Parent类的method1()方法被调用了");
    }
    public void method2(){
        System.out.println("Parent类的method2()方法被调用了");
    }

    /**
     * 联系覆盖的方法:编写一个静态方法invokMethods,参数为
     * parent类的引用,方法中首先使用instanceof判断参数指向对象所
     * 属的类,然后调用method1()方法和method2()方法
     * 然后编写一个程序,分别使用Parent类的实例和Child实例为参数
     * 调用invokeMethods()方法
     *
     */
    public static void invokeMethods(Parent parent){
        if (parent instanceof Object){
            parent.method1();
            parent.method2();
        }
    }


    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.invokeMethods(parent);
        Child child = new Child();
        child.invokeMethods(child);
        Child2 child2 = new Child2();
        child2.method2();
    }
}
