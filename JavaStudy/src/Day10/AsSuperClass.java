package Day10;

import Day11.CarBase;

public class AsSuperClass {
    public static void main(String[] args) {
        Car car = new Car();
        SportsCar sportsCar = (SportsCar) car;
        sportsCar.addN(30);
    }


}
