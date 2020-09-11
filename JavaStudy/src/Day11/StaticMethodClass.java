package Day11;

public class StaticMethodClass {
    public static int staticValue = 5;
    public int common = 7;

    public static void staticMethod(int baseValue){
        int resultValue = baseValue + staticValue;
        System.out.println("resulValue的值是:"+resultValue);
    }

    public static void anotherStaticMethod(){
        StaticMethodClass.staticMethod(5);

    }
    public void commonMethod(){
        StaticMethodClass.staticMethod(6);
    }
}
