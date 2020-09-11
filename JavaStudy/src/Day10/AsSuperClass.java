package Day10;

import Day11.CarBase;

public class AsSuperClass {
    public static void main(String[] args) {
        SportsCar sports = new SportsCar();
        Car car = sports;
        car.addN(11);
        sports.addN(30);
    }


}
