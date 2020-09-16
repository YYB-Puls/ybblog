package Day11;

public class SubClassInDiffPackage extends AccessMethods {
    public void usingPublicMethod(){
        super.defaultMethod();
    }

    public void publicMethod(){

    }

    public void usingProtectedMethod(){
        super.publicMethod();
    }
    public void protectedMethod(){}
}
