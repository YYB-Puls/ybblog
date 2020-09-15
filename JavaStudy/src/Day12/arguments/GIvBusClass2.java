package Day12.arguments;

import Day10.Bus;
import Day10.ElectronicBus;

public class GIvBusClass2 implements GiveMeABus {
    public ElectronicBus giveMeABus(Bus base){
        return new ElectronicBus();
    }
}
