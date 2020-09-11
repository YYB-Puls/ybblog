package Day11;

public class SubClassInDiffPackage extends  AccessMethods {
    //子类访问该方法
    public void suingPuBlicMethod(){
        super.publicMethod();
    }
    public void publicMethod(){}
}
