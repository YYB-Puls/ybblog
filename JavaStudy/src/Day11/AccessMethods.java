package Day11;

public class AccessMethods {
    //没有权限限制
    public void publicMethod(){}
    //同级包类访问
    void  defaultMethod(){}
    //子类访问
    protected  void protectedMethod(){}
    //同类访问
    private void privaterMethod(){}
}
