package Day11;

public class TestStaticMethod {

    public static void main(String[] args) {
        System.out.println("====调用ParentClass.staticMethod====");
        ParentClass.staticMethod();

        System.out.println("====调用SubClass.staticMethod====");
        SubClass.staticMethod();
    }



}
