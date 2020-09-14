package Day10;

public class UseOverriderComm {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        System.out.println("===汽车开始加速====");
        System.out.println("加速前汽车的速度为:"+sportsCar.speed+",剩余氮气为:"+sportsCar.nAmount);
        carBase.speedUp(50);
        System.out.println("加速后汽车速度为:"+sportsCar.speed+",剩余氮气为:"+sportsCar.nAmount);
        System.out.println("=====汽车加速完毕======");
    }
}
