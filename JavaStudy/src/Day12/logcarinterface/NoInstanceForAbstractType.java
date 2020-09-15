package Day12.logcarinterface;

import Day12.Transport.Bike;
import Day12.Transport.CarBase;

public class NoInstanceForAbstractType {
    public static void main(String[] args) {
        RecordeAble instancel = null;
        instancel = new Bike();

        RecordeAble instancel2 = new CarBase();
    }
}
