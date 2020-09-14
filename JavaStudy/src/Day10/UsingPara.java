package Day10;

public class UsingPara {
    public static void main(String[] args) {
        /*SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(90);
        System.out.println("sportsCar的速度为:"+sportsCar.speed);
        bus.followSpeed(sportsCar);
        System.out.println("bus的速度为:"+bus.speed);*/

        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(90);
        System.out.println("sportsCar的速度为:"+sportsCar.speed);
        System.out.println("SportsCar开始follwSpeed参数bus");
        sportsCar.followSpeed(bus);
        System.out.println("follwSpeedUp结束");
        System.out.println("SportsCar的速度为:"+sportsCar.speed);

    }
}
