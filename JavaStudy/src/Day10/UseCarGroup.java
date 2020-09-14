package Day10;

public class UseCarGroup {
    public static void main(String[] args) {
        CarBase leading = new  CarBase();
        //创建一个Car数组
        CarBase[] followingCars = new  CarBase[]{new  CarBase(), new SportsCar() , new Bus(), new ElectronicBus()};
        //创建车队对象
        CarGroup group = new CarGroup(leading,followingCars );
        //车队加度
        group.speedUp(50);
        //车队减速
        group.slowDown(10);
    }
}
