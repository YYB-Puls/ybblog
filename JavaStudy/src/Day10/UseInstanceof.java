package Day10;

public class UseInstanceof {
    public static void main(String[] args) {
        ElectronicBus electronicBus = new ElectronicBus();
        CarBase base = electronicBus;
        if (base instanceof Object){
            System.out.println("base指向的对象是object类的一个对象");
        }else{
            System.out.println("base指向的对象不是object类的一个对象");
        }
        if (base instanceof CarBase){
            System.out.println("base指向的对象是CarBase类的一个对象");
        }else {
            System.out.println("base指向的对象不是CarBase类的一个对象");
        }
        if (base instanceof Bus){
            System.out.println("base指向的对象是Bus类的一个对象");
        }else {
            System.out.println("base指向的对象不是Bus类的一个对象");
        }
        if (base instanceof ElectronicBus){
            System.out.println("base指向的对象是ElectrionBus类的一个对象");
        }else {
            System.out.println("base指向的对象不是ElectrionBus类的一个对象");
        }
        if (base instanceof SportsCar){
            System.out.println("base指向的对象是SportsCar类的一个对象");
        }else {
            System.out.println("base指向的对象不是SportsCar类的一个对象");
        }
    }
}
