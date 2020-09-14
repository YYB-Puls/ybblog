package Day10;

public class UseOverLoadII {
    public static void main(String[] args) {
        UseCar useCar = new UseCar();
        CarBase base = new CarBase();
        System.out.println("使用CarBase类的对象做参数调用UseCar类的setCar()方法");
        useCar.setCar(base);
        System.out.println("使用SportsCar类的对象做参数调用UserCar类的setCar()方法");
        base = new SportsCar();
        useCar.setCar(base);
        System.out.println("使用Bus类的对象做参数调用UserCar类的setCar()方法");
        base = new Bus();
        useCar.setCar(base);
        System.out.println("使用ElectronicBus类的对象做参数调用UserCar类的setCar()方法");
        base = new ElectronicBus();
        useCar.setCar(base);
    }
}
