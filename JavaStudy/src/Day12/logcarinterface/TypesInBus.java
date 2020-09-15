package Day12.logcarinterface;

import Day12.Transport.Bus;
import Day12.Transport.CarBase;

public class TypesInBus {
    public static void main(String[] args) {
        Bus bus = new Bus();
        if (bus instanceof Bus){
            System.out.println("bus指向的对象是一个Bus类型的实例");
        }else {
            System.out.println("bus指向的对象不是一个Bus类型的实例");
        }
        if (bus instanceof CarBase){
            System.out.println("bus指向的对象是一个CarBase类型的实例");
            System.out.println("使用bus给CarBase类的引用赋值");
            CarBase base = bus;
        }else {
            System.out.println("bus指向的对象不是一个CarBase类型的实例");
        }
        if (bus instanceof Object){
            System.out.println("bus指向的对象是一个Object类型的实例");
            System.out.println("使用bus给Object类的引用赋值");
            Object object = bus;
        }else {
            System.out.println("bus指向的对象不是一个Object类型的实例");
        }

    }
}
