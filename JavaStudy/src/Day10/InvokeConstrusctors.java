package Day10;

public class InvokeConstrusctors {
    public static void main(String[] args) {
        System.out.println("=====开始创建Bus类的对象======");
        Bus bus  =  new Bus();
        System.out.println("=====创建ElctronicBus类的对象结束");
        System.out.println();
        System.out.println("====开始创建SportsCar类的对象=======");
        SportsCar sportsCar = new SportsCar("红色",200,"红色跑车",0,90);
        System.out.println("=====创建SportsCar类的对象结束=======");

    }
}
