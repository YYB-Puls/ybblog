package Day11;

public class SamePackage {
    //同一包中访问该方法
    public void usingPublicMethod(){
        AccessMethods accessMethods = new AccessMethods();
        accessMethods.publicMethod();
    }

}