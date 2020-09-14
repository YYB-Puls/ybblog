package Day10;

public class UseOverLoad {
    public static void main(String[] args) {
        UseCar useCar = new UseCar();
        CarBase carBase = new CarBase();
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        ElectronicBus electronicBus = new ElectronicBus();
        System.out.println("使用CarBase类的对象做参数调用UseCar类的setCar()方法");
        useCar.setCar(carBase);
        System.out.println("使用SportsCar类的对象做参数调用UseCar类的setCar()方法");
        useCar.setCar(sportsCar);
        System.out.println("使用Bus类的对象做参数调用UserCar类的setCar()方法");
        useCar.setCar(bus);
        System.out.println("使用ElectronicBus类的对象做参数调用UserCar类的setCar()方法");
        useCar.setCar(electronicBus);
    }
}
