package Day09;

public class StaticMethod {
    static  int base = 3;
    int variable =5;

    //不能调用非static的方法或使用非statice的变量
    public static void staticMaehod1(int a){
        //创建一个对象
        StaticMethod staticMethod = new StaticMethod();
        //通过指向对象的引用调用非static的方法是没有问题的
        staticMethod.commMethod(a);
        //通过类名直接调用类方法
        staticMethod.commMethod(a+staticMethod.base);
        //通过同一个类中的类方法可以省略类名
        staticMethod2(a + base);
        System.out.println("类方法StaticMethod1被调用了,参数为:"+a);
    }
    public void commMethod(int a){
        System.out.println("commMtehod可以使用类变量"+StaticMethod.base);
        staticMethod2(variable);
        System.out.println("commMethod被调用了,参数为:"+a);

    }
    //静态方法
    public static void staticMethod2(int a){
        System.out.println("类方法staticMethod2被调用了,参数为:"+a);
    }
}
