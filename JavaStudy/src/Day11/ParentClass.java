package Day11;

public class ParentClass {
    private void privateMethod(){
        System.out.println("这是类ParentClass中的privateMethod()方法");
    }
    void defaultMethod(){
        System.out.println("这是类ParentClass中的defaultMethod()方法");
    }
    public void publicMethod(){
        System.out.println("这是类parentClass总的publicMethod()方法");
    }
    protected void protectedMethod(){
        System.out.println("这是类parentClass中的protectedMethod()方法");
    }

    public void test(){
        privateMethod();
        defaultMethod();
        publicMethod();
        protectedMethod();
    }
}
