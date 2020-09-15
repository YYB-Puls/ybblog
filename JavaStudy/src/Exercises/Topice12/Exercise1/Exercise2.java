package Exercises.Topice12.Exercise1;

public class Exercise2 {
    /**
     * 12.2:
     *      接口屏蔽了类型之间的差异:编写一个静态方法userMyInterface(),参数为MyInterface的引用,
     *      方法中首先使用instanceof判断参数指向的对象所属的类,
     *      然后调用method1()方法和method2()方法.
     *      然后编写一个程序,分别使用MyImpl1类的实例和MyImpl2类的实例为参数,调用userMyInterface()方法
     * @param myInterface
     */
    //编写一个静态方法userMyInterface(),参数为MyInterface的引用,
    public static void  useMyInterface(MyInterface myInterface){
        //方法中首先使用instanceof判断参数指向的对象所属的类,
        if (myInterface instanceof MyImpl1){
            System.out.println("myInterface指向的对象MyImpl1是同一个类型的实例");
            myInterface.method1();
            myInterface.method2();
        }
        if (myInterface instanceof  MyImpl2){
            System.out.println("myInterface指向的对象MyImpl2是同一个类型的实例");
            myInterface.method1();
            myInterface.method2();
        }
    }
}
