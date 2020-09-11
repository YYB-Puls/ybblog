package Day11;

public class TestStaticMethodll {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        System.out.println("====通过ParentClass类的引用Parent调用commonMethod()方法====");
        parent.commonMethod();
        System.out.println("===通过ParentClass类的引用Parent调用staticMethod()方法====");
        parent.staticMethod();
        parent = new SubClass();
        System.out.println("===让ParentClass类的引用Parent调用commonMethod()方法===");
        parent.commonMethod();
        System.out.println("===通过ParentClass类的引用Parent调用staticMethod()方法====");
        parent.staticMethod();
    }
}
