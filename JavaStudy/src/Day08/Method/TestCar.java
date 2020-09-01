package Day08.Method;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.direaCar();
        System.out.print("现在的车速为:"+car.speed);
        System.out.print(",行驶的方向:"+car.direaction);
    }
}
