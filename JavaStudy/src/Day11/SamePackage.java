package Day11;

public class SamePackage {
    /*public static void main(String[] args) {
        AccessMethods methods = new AccessMethods();
        methods.publicMethod();
    }*/

    public void suingPublicMethod(){
        AccessMethods methods = new AccessMethods();
        methods.publicMethod();
        methods.defaultMethod();
    }
}
