package Day10;

public class UseExtends {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println("9位乘客登上了公交车");
        bus.getOneBus(9);
        System.out.println("公交车出发");
        bus.speedUp(50);
        System.out.println("公交车当前的速度为:"+bus.speed);
        System.out.println("当前公交车的乘客为:"+bus.current_Passenger);
        System.out.println("公交车到站了!");
        bus.slowDown(50);
        System.out.println("5位乘客下了公交车");
        bus.getDownBus(5);
        System.out.println("公交车当前的速度为:"+bus.speed);
        System.out.println("当前公交车的乘客为:"+bus.current_Passenger);
        System.out.println("公交车出发了!");
        bus.speedUp(70);
        System.out.println("公交车当前的速度为:"+bus.speed);
        System.out.println("4位乘客下了公交车");
        bus.getDownBus(4);
        bus.slowDown(70);
        System.out.println("公交车当前的速度为:"+bus.speed);
        System.out.println("当前公交车的乘客为:"+bus.current_Passenger);
    }
}
