package Day12;


public class LogCarOnAStreet {
    public static void main(String[] args) {
        CarBase carBase = null;
        carBase  =  new CarBase("红色","天津大发",0);
        carBase.speedUp(50);
        CarRecoder.recordCar(carBase);
        carBase = new Bus("黄色","大桥六线",0,0,0);
        carBase.speedUp(60);
        CarRecoder.recordCar(carBase);
        carBase =  new SportsCar("黄色","Eclipse",0,0);
        carBase.speedUp(70);
        CarRecoder.recordCar(carBase);
    }

}
