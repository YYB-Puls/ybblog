package Day10;

import Day09.Car;

public class ForceConvertion {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        System.out.println("尝试将Base引用强制类型转换为SprotsCar类的引用");
        SportsCar converted = (SportsCar) carBase;
        System.out.println("转换成功");
        System.out.println("使用converted调用addN方法");
        converted.addN(45);
        System.out.println("converted.nAmount的值为:"+converted.nAmount);

        Object object = converted;
        System.out.println("将object 类引用强制类型转换为CarBase类引用");
        CarBase carBase1 = (CarBase) object;
        System.out.println("将Object类引用强制类型转换为SportsCar类引用");
        SportsCar sportsCar1 = (SportsCar) object;
    }
}
