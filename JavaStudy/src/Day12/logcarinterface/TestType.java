package Day12.logcarinterface;

import Day12.Transport.Bus;
import Day12.Transport.CarBase;

public class TestType {
    public static void main(String[] args) {
        CarBase base = new CarBase();
        Bus bus = new Bus();
        if (base instanceof RecordeAble){
            System.out.println("base指向的对象是一个RecordeAble类型的实例");
            System.out.println("使用base给RecordeAble类的引用赋值");
            RecordeAble recordeAble = base;
        }else {
            System.out.println("base指向的对象不是一个RecordeAble类型的实例");
        }

        if (bus instanceof RecordeAble){
            System.out.println("bus指向的对象是一个RecordeAble类型的实例");
            System.out.println("使用bus给RecordeAble类的引用赋值");
            RecordeAble recordeAble = bus;
        }else{
            System.out.println("bus指向的对象不是一个RecordeAble类型的实例");
        }

    }
}
