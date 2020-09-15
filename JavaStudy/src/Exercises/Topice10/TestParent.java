package Exercises.Topice10;

public class TestParent {
    public static void main(String[] args) {
        //然后编写一个程序,分别使用Parent类的实例和Child实例为参数调用invokeMethods()方法
        Parent parent = new Parent();
        parent.invokeMethods(parent);
        Child child = new Child();
        child.invokeMethods(child);

        //使用Child2类的实例调用invokeMethods()方法
        Child2 child2 = new Child2();
        child2.invokeMethods(child2);
    }
}
