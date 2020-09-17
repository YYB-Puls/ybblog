package Day11;

public class AccessMethods {
    //public修饰的方法
    public void publicMethod(){
        System.out.println("AccessMethods类的publicMethod方法");
    }



    void defaultMethod(){
        System.out.println("AccessMethods类的defaultMethod方法");
    }
    protected void protectdMethod(){
        System.out.println("AccessMethods类的protectdMethod方法");
    }
    private void privateMethod(){
        System.out.println("AccessMethods类的privateMethod方法");
    }
    //类中的其他方法
     private void usingMethod(){
        //this关键字调用方法
        this.publicMethod();
        this.protectdMethod();
        this.defaultMethod();
        this.privateMethod();
    }
}
