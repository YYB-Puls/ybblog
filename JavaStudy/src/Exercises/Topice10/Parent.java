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

    /**
     * 2.联系覆盖的方法:编写一个静态方法invokMethods,参数为
     * parent类的引用,方法中首先使用instanceof判断参数指向对象所
     * 属的类,然后调用method1()方法和method2()方法
     * 然后编写一个程序,分别使用Parent类的实例和Child实例为参数
     * 调用invokeMethods()方法
     */
    //编写一个静态方法invokMethods参数为parent类的引用
    public static void invokeMethods(Parent parent) {
        //方法中首先使用instanceof判断参数指向对象所属的类,然后调用method1()方法和method2()方法
        if (parent instanceof Parent) {
            parent.method1();
            parent.method2();
        }
        //todo instance用来准确区分不同类型对象的，如果都用父类所有对象继承Object，instanceof就没有意义了
        if (parent instanceof Child) {
            Child child = (Child) parent;
            child.method1();
            child.method2();
        }

        if (parent instanceof Child2) {
            Child2 child = (Child2) parent;
            child.method1();
            child.method2();
        }

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
