package Exercises.Topice10;

public class TestParent {
    public static void main(String[] args) {
        //然后编写一个程序,分别使用Parent类的实例和Child实例为参数调用invokeMethods()方法
        Parent parent = new Parent();
        invokeMethods(parent);
        Child child = new Child();
        invokeMethods(child);

        //使用Child2类的实例调用invokeMethods()方法
        Child2 child2 = new Child2();
        invokeMethods(child2);
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
        // todo 这句话没有任何意义，就像你爹是你爹一样没有意义，好好琢磨一下
        if (parent instanceof Parent) {
            parent.method1();
            parent.method2();
        }
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
}
