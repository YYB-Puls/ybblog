package Day12.arguments;

import Day12.Transport.CarBase;
import Day12.logcarinterface.RecordeAble;

public class GiveRecordeAble implements GiveMeARecordeAble {
    @Override
    public RecordeAble giveMeArecordeAble() {
        return new CarBase();
    }
}
