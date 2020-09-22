package Day15.simplecopier;

public class SimpleCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Copier shrarp = new Copier("夏普");
        Employee simth = new Employee("simeth",2 ,canon );
        Employee john = new Employee("john",3 ,shrarp );
        simth.start();
        john.start();
    }
}
