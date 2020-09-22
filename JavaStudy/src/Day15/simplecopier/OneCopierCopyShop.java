package Day15.simplecopier;

public class OneCopierCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Employee simth = new Employee("simth",1 ,canon );
        Employee john = new Employee("john",3 ,canon );
        simth.start();
        john.start();
    }
}
