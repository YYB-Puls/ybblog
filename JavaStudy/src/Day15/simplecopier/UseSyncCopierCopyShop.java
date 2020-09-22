package Day15.simplecopier;

public class UseSyncCopierCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Employee simth = new Employee("simth",1 ,canon );
        Employee john = new Employee("john",2 ,canon );
        simth.start();
        john.start();
    }
}
