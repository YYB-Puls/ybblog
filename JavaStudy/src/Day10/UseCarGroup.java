package Day10;

public class UseCarGroup {
    public static void main(String[] args) {
        Car leading = new Car();
        //创建一个Car数组
        Car[] followingCars = new Car[]{new Car(), new SportsCar() , new Bus(), new ExlectronicBus()};
        //创建车队对象
        CarGroup group = new CarGroup(leading,followingCars );
        //车队加度
        group.speedUp(50);
        //车队减速
        group.slowDown(10);
    }
}
