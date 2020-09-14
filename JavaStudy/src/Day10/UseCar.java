package Day10;

public class UseCar {
    public CarBase carBase;
    public void  setCar(CarBase carBase){
        System.out.println("setCar(CarBase)方法被调用了");
        this.carBase = carBase;
    }
    public void setCar(ElectronicBus bus){
        System.out.println("setCar(ElectronicBus)方法被调用了");
        this.carBase = bus ;
    }
}
