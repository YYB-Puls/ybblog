package Day10;

public class UseOverrideSimple {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println("=====跑车开始加速======");
        System.out.println("加速前跑车速度为:"+sportsCar.speed+",剩余氮气为:"+sportsCar.nAmount);
        sportsCar.speedUp(50);
        System.out.println("加速后跑车速度为:"+sportsCar.speed+",剩余氮气为:"+sportsCar.nAmount);
        System.out.println("=====跑车加速完毕=====");

    }
}
