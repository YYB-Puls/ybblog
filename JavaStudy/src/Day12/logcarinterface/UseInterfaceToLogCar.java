package Day12.logcarinterface;

import Day12.Transport.Bike;
import Day12.Transport.Bus;
import Day12.Transport.CarBase;

public class UseInterfaceToLogCar {
    public static void main(String[] args) {
        CarBase car  = new CarBase("红色","天津大发",0);
        car.speedUp(50);
        TransportRecoderForLog.recoordTransport(car);
        Bus bus = new Bus("黄色","大桥六线",0,0,0) ;
        bus.speedUp(60);
        TransportRecoderForLog.recoordTransport(car);

        Bike bike = new Bike();
        bike.setName("自行车");
        bike.setSpeed(10);
        TransportRecoderForLog.recoordTransport(bike);
    }
}
