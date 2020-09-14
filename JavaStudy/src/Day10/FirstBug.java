package Day10;

public class FirstBug {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(30);
        bus.speedUp(70);
        System.out.println("bus的速度为:"+bus.speed);
        System.out.println("sportsCar的速度为:"+sportsCar.speed);
        System.out.println("bus开始follwUp参数SportsCar");
        bus.followSpeed(sportsCar );
        System.out.println("follwUp结束");
        System.out.println("bus的速度为:"+bus.speed);
        System.out.println("SportsCar的速度为:"+sportsCar.speed);
    }
}
