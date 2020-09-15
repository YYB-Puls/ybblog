package Day12;


public class LogCarOnAStreet {
    public static void main(String[] args) {
        CarBase car = null;
        car = new CarBase("红色","天津大发",0);

        car.speedUp(50);
        CarRecoder.recordCar(car);
        car = new Bus("黄色","大桥六线",0,0,0);

        car.speedUp(60);
        CarRecoder.recordCar(car);
        car = new SportsCar("黄色","Eclipse",0,0);

        car.speedUp(70);
        CarRecoder.recordCar(car);
    }
}
