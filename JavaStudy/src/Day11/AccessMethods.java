package Day11;

public class AccessMethods {
    //public修饰的方法
    protected void publicMethod(){}


    //类中的其他方法
    protected void usingMethod(){
        //this关键字调用方法
        this.publicMethod();
    }
}
