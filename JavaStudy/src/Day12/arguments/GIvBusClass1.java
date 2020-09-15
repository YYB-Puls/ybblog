package Day12.arguments;

import Day10.Bus;

public class GIvBusClass1 implements GiveMeABus{
    @Override
    public Bus giveMeABus(Bus bus) {
        return bus;
    }
}
