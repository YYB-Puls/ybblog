package Day13.innerclass;

public class UnStaticMethod {
    private int variableInClass = 2;
    private static int staticVariableInClass = 1;

    public static void staticMethod(){
        final int variableInMethod = 3;
        class InUnstaticMethod{
            //再类中可以使用StaticVariableInClass和VariableInMethod
        }
    }

    public void method(){
        final int variableInMethod = 3;
        class InUnstaticMethod{
            public int variableInner = 4;
            public void innerMethod(){
                int innerMehodVariable = 5;
                System.out.println("内部类UnStaticMethod中innerMethod()方法里的局部变量:"+innerMehodVariable);
                System.out.println("内部类InUnstaticMethod中的的成员变量"+variableInner);
                System.out.println("外部类method()方法中的variableInMethod变量"+variableInMethod);
                System.out.println("外部类UnstaticMethod的对象中的成员变量variableInClass"+variableInClass);
                System.out.println("外部类UnStaticMethod的静态变量staticVariableInClass"+staticVariableInClass);
            }
        }
    }
}
